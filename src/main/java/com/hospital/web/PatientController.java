package com.hospital.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/patient")
public class PatientController {
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	@RequestMapping("/join")     /*mvc가 차끌고 다니면서 wiring 하고 있다.*/
	public String goJoin(){
		logger.info("PatientController -goJoin() {}","ENTER"); /*매 method마다 가져다 부친다 */
		return "public:patient/registerForm";
	}
	@RequestMapping("/login")  
	public String goLogin(){
		logger.info("PatientController -goLogin() {}","ENTER"); /*goLogin이라는 method안으로 진입하였다*/
		return "public:common/loginForm";
	}
	@RequestMapping(value="/login",method = RequestMethod.POST)  
	public String goLogin(Model model){
		logger.info("PatientController -goLogin() {}","POST"); /*goLogin이라는 method안으로 진입하였다*/
		model.addAttribute("name", "홍길동"); /*model = request.getParameter*/
		return "patient:patient/containerDetail"; 
	}
	@RequestMapping("/doctor/{docID}")  
	public String getDoctorInfo(@PathVariable String docID){
		logger.info("PatientController -goLogin() {}","ENTER"); /*goLogin이라는 method안으로 진입하였다*/
		logger.info("PatientController -docID=() {}",docID);
		return "patient:patient/doctorInfo";
	}
}
