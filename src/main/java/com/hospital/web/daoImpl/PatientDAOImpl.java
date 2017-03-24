package com.hospital.web.daoImpl;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hospital.web.dao.PatientDAO;
import com.hospital.web.domain.PatientDTO;
@Repository
public class PatientDAOImpl implements PatientDAO {
	@Autowired	PatientDAO dao;

	@Override
	public int insert(PatientDTO patient) throws SQLException {
		return 0;
	}

	@Override
	public PatientDTO selectById(String id) throws SQLException {
		PatientDTO member = new PatientDTO();

		return member;
	}

	@Override
	public int update(PatientDTO member) throws SQLException {
		return 0;
	}

	@Override
	public int delete(PatientDTO member) throws SQLException {
		return 0;

	}
}
