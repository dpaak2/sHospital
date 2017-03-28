package com.hospital.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.web.domain.PatientDTO;
import com.hospital.web.mapper.PatientMapper;
import com.hospital.web.service.ExistService;
import com.hospital.web.service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	@Autowired
	PatientService service;/* 로딩하는순간 연결끝 -mvc가 던져주고 간다. */
	@Autowired
	PatientDTO patient;
	@Autowired
	PatientMapper mapper;

	@RequestMapping("/join") /* mvc가 차끌고 다니면서 wiring 하고 있다. */
	public String goJoin() {
		logger.info("PatientController -goJoin() {}",
				"ENTER"); /* 매 method마다 가져다 부친다 */
		return "public:patient/registerForm";
	}

	@RequestMapping("/login")
	public String goLogin() {
		logger.info("PatientController -goLogin() {}",
				"ENTER"); /* goLogin이라는 method안으로 진입하였다 */
		logger.info("PatientController -goLogin() {}", "ENTER");
		return "public:common/loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String goLogin(@RequestParam("id") String id,
			@RequestParam("password") String password, /*
														 * 이미 값을 주입받았다 ,그냥 존재한다
														 */
			Model model) throws Exception { /* mvc가 값을 머금고 있다가 id에 던지고 간다 */
		logger.info("PatientController -goLogin() {}",
				"POST"); /* goLogin이라는 method안으로 진입하였다 */
		logger.info("PatientController -id, pw () {}", id + "," + password);
		patient.setPatID(id);
		patient.setPatPass(password);

		/* int count=service.count(); 존재여부를 확인 serviceImpl */
		ExistService ex = new ExistService() {

			@Override
			public int exist(Object o) throws Exception {
				logger.info("=======what is ID?{}====", o);
				return mapper.exist(id);
			}
		};
		int count = ex.exist(id);
		logger.info("Dose id exsit at DB? () {}", count);
		String movePostion="";
		if (count==0) {
			logger.info("DB RESULT: {}", "ID dose not exsit");
			movePostion= "public:common/loginForm";
		} else {
			patient = service.login(patient);
			logger.info("DB RESULT: {}", "success");
			if(patient.getPatPass().equals(password)){
				model.addAttribute("patient",patient); /*patient에 patient객체를 넣어줌*/
				movePostion= "patient:patient/containerDetail";
			}else{
				logger.info("DB RESULT: {}", "password not match");
				movePostion= "public:common/loginForm";

			}
			patient = service.login(patient); /* db연결 */
			
		}
		return movePostion;
		/*model.addAttribute("name",
				patient.getPatName());  model = request.getParameter 
		model.addAttribute("job", patient.getPatJob());
		model.addAttribute("gen", patient.getPatGen());
		model.addAttribute("phoneNO", patient.getPatPhone());
		model.addAttribute("addr", patient.getPatAddr());
		model.addAttribute("doctor", patient.getDocID());*/
		
	}

	@RequestMapping("/doctor/{docID}")
	public String getDoctorInfo(@PathVariable String docID) {
		logger.info("PatientController -goLogin() {}",
				"ENTER"); /* goLogin이라는 method안으로 진입하였다 */
		logger.info("PatientController -docID=() {}", docID);
		return "patient:patient/doctorInfo";
	}
}
