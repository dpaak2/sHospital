package com.hospital.web.service;

import org.springframework.stereotype.Component;

import com.hospital.web.domain.Doctor;
@Component
public interface DoctorService {
	public int join(Doctor bean) throws Exception;
	public Doctor findbyId(String id) throws Exception;
	public Doctor login(Doctor bean) throws Exception;
	public boolean logout() throws Exception;
	public int change(Doctor bean) throws Exception;
	public int remove(Doctor bean) throws Exception;
}
