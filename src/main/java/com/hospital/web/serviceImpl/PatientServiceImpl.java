package com.hospital.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hospital.web.dao.PatientDAO;
import com.hospital.web.domain.PatientDTO;
import com.hospital.web.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	@Autowired PatientService service;
	@Autowired PatientServiceImpl instance;
	@Autowired PatientDAO dao;
	@Autowired PatientDTO session;
	@Override
	public int join(PatientDTO patient) throws Exception {
		return dao.insert(patient);
		
	}

	@Override
	public PatientDTO findById(String id) throws Exception {
		return dao.selectById(id);
	}

	@Override
	public PatientDTO login(PatientDTO patient) throws Exception {
	
		session =null ;/*this.findById(patient.patID())*/
		return session;
	}
	@Override
	public boolean logout() throws Exception {
		
		return true;
	}
	@Override
	public int change(PatientDTO patient) throws Exception{
		return dao.update(patient);
	}

	@Override
	public int remove(PatientDTO patient) throws Exception{
		return dao.delete(patient);
	}

	@Override
	public String getBirth(String patJumin) {
		String temp=null;
		/*int year = Integer.parseInt(session.getPatJumin().substring(0,2));
		int month = Integer.parseInt(session.getPatJumin().substring(2,4));
		int day = Integer.parseInt(session.getPatJumin().substring(4,6));
		String temp = String.format("19%d�� %d�� %d��", year,month,day);*/
		return temp;
	}
	@Override
	public String getAge(String patJumin) {
		return null;
				/* String.valueOf(117-Integer.parseInt(session.getPatJumin().substring(0,2))+1)+"��";*/
	}

	@Override
	public PatientDTO getSession() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
