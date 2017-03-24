package com.hospital.web.service;

import org.springframework.stereotype.Component;

import com.hospital.web.domain.DoctorDTO;
@Component
public interface DoctorService {
	public int join(DoctorDTO bean) throws Exception;
	public DoctorDTO findbyId(String id) throws Exception;
	public DoctorDTO login(DoctorDTO bean) throws Exception;
	public boolean logout() throws Exception;
	public int change(DoctorDTO bean) throws Exception;
	public int remove(DoctorDTO bean) throws Exception;
}
