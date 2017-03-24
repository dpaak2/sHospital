package com.hospital.web.dao;

import com.hospital.web.domain.DoctorDTO;

public interface DoctorDAO {
		public int insert(DoctorDTO bean) throws Exception;
		public DoctorDTO selectById(String id) throws Exception;
		public int update(DoctorDTO bean) throws Exception;
		public int delete(DoctorDTO bean) throws Exception;
}
