package com.hospital.web.imapper;

import org.springframework.stereotype.Component;

import com.hospital.web.domain.Patient;
@Component 
public interface IPatientMapper { 
	public int insert(Patient member) throws Exception;
	public Patient selectById(String id) throws Exception;
	/*public boolean login(PatientBeab member) throws Exception;*/
	public int update(Patient member) throws Exception;
	public int delete(Patient member) throws Exception;
	public int count()throws Exception;
	public int exist(String id)throws Exception;
}
