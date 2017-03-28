package com.hospital.web.dao;

import com.hospital.web.domain.Doctor;

public interface DoctorDAO {
		public int insert(Doctor bean) throws Exception;
		public Doctor selectById(String id) throws Exception;
		public int update(Doctor bean) throws Exception;
		public int delete(Doctor bean) throws Exception;
}
