package com.hospital.web.service;

import org.springframework.stereotype.Component;

import com.hospital.web.domain.Patient;
@Component
public interface PatientService {
	//DAO 값을 토스해주는 로직
		public int join(Patient member) throws Exception;
		public Patient findById(String id) throws Exception;
		public Patient login(Patient member) throws Exception;
		public boolean logout() throws Exception;
		public int change(Patient member) throws Exception;
		public int remove(Patient member) throws Exception;
		//추가된 로직
		public String getBirth(String patJumin);
		public String getAge(String patJumin);
		public Patient getSession();
		public int count()throws Exception;
		
		
}
