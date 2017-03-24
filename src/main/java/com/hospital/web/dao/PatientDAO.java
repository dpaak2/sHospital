package com.hospital.web.dao;

import com.hospital.web.domain.PatientDTO;

public interface PatientDAO {
	public int insert(PatientDTO member) throws Exception;
	public PatientDTO selectById(String id) throws Exception;
	/*public boolean login(PatientBeab member) throws Exception;*/
	public int update(PatientDTO member) throws Exception;
	public int delete(PatientDTO member) throws Exception;
}
