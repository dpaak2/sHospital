package com.hospital.web.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.web.dao.DoctorDAO;
import com.hospital.web.domain.DoctorDTO;

@Repository
public class DoctorDAOImpl implements DoctorDAO {
	@Autowired DoctorDAO dao;
	@Override
	public int insert(DoctorDTO bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DoctorDTO selectById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(DoctorDTO bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(DoctorDTO bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
