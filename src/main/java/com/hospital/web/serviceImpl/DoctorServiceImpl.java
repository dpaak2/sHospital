package com.hospital.web.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hospital.web.domain.Doctor;
import com.hospital.web.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired DoctorService service;
	@Override
	public int join(Doctor bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Doctor findbyId(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor login(Doctor bean) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int change(Doctor bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Doctor bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
