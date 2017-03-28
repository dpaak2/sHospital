package com.hospital.web.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hospital.web.PatientController;
import com.hospital.web.dao.PatientDAO;
import com.hospital.web.domain.Patient;
import com.hospital.web.mapper.PatientMapper;
import com.hospital.web.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	private static final Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);
	@Autowired
	PatientService service;
	@Autowired
	Patient patient; /* spring root context에 값이 있다 */
	@Autowired	PatientMapper mapper;

	@Override
	public int join(Patient patient) throws Exception {
		logger.info("PatientServiceImpl -join() {}", "join");
		return 0;
	}

	@Override
	public Patient findById(String id) throws Exception {
		logger.info("PatientServiceImpl -findById() {}", "findById");
		return null;
	}

	@Override
	public Patient login(Patient member) throws Exception {
		logger.info("PatientServiceImpl -login() {}", "login");

		return mapper.selectById(member.getPatID());
	}

	@Override
	public boolean logout() throws Exception {
		logger.info("PatientServiceImpl -logout() {}", "logout");

		return true;
	}

	@Override
	public int change(Patient patient) throws Exception {
		logger.info("PatientServiceImpl -goJoin() {}", "ENTER");
		return 0;
	}

	@Override
	public int remove(Patient patient) throws Exception {
		logger.info("PatientServiceImpl -goJoin() {}", "ENTER");
		return 0;
	}

	@Override
	public String getBirth(String patJumin) {
		logger.info("PatientServiceImpl -goJoin() {}", "ENTER");
		String temp = null;
		/*
		 * int year = Integer.parseInt(session.getPatJumin().substring(0,2));
		 * int month = Integer.parseInt(session.getPatJumin().substring(2,4));
		 * int day = Integer.parseInt(session.getPatJumin().substring(4,6));
		 * String temp = String.format("19%d�� %d�� %d��", year,month,day);
		 */
		return temp;
	}

	@Override
	public String getAge(String patJumin) {
		logger.info("PatientServiceImpl -goJoin() {}", "ENTER");
		return null;
		/*
		 * String.valueOf(117-Integer.parseInt(session.getPatJumin().substring(0
		 * ,2))+1)+"��";
		 */
	}

	@Override
	public Patient getSession() {
		logger.info("PatientServiceImpl -goJoin() {}", "ENTER");
		return null;
	}

	@Override
	public int count() throws Exception {
		logger.info("PatientServiceImpl -count() {}", "ENTER");
		return mapper.count();
	}

}
