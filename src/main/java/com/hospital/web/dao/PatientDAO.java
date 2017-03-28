package com.hospital.web.dao;

import com.hospital.web.domain.Patient;

public interface PatientDAO {
	public int insert(Patient member) throws Exception;
	public Patient selectById(String id) throws Exception;
	/*public boolean login(PatientBeab member) throws Exception;*/
	public int update(Patient member) throws Exception;
	public int delete(Patient member) throws Exception;
}
