package com.hospital.web.daoImpl;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hospital.web.dao.PatientDAO;
import com.hospital.web.domain.Patient;
@Repository
public class PatientDAOImpl implements PatientDAO {
	@Autowired	PatientDAO dao;

	@Override
	public int insert(Patient patient) throws SQLException {
		return 0;
	}

	@Override
	public Patient selectById(String id) throws SQLException {
		Patient member = new Patient();

		return member;
	}

	@Override
	public int update(Patient member) throws SQLException {
		return 0;
	}

	@Override
	public int delete(Patient member) throws SQLException {
		return 0;

	}
}
