package com.hospital.web.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.web.dao.BoardDAO;
import com.hospital.web.domain.Article;
@Repository
public class BoardDAOImpl implements BoardDAO{
	@Autowired BoardDAO dao;
	@Override
	public int insert(Article param) throws Exception {
		String sql = "";
		return 0;
	}

	@Override
	public Article selectBySeq(Article param) throws Exception {
		Article article = null;  // null checking�� �ϱ� ���ؼ� 
		
		String sql = String.format("SELECT art_seq, pat_id, title, content, regdate, read_count FROM Article WHERE art_seq='%s'", param.getSeq());
	
	
		return article;
	}

	@Override
	public List<Article> selectByWord(String[] param) throws Exception {
		List<Article> listSome = new ArrayList<Article>();
		Article article = null;				
		String sql = "SELECT art_seq, id, title, contents, regdate, read_count FROM Article "
				   + " WHERE "+param[0]+" LIKE '%"+param[1]+"%'";
		System.out.println("DAO���� ����� ����:"+sql);
		
	
		return listSome;
	}

	@Override
	public List<Article> selectAll(int[] pageArr) {
		List<Article> listAll = new ArrayList<Article>();
		Article article = null;
		String sql = String.format(
				"SELECT t2.*"
			   +"\tFROM (SELECT ROWNUM seq,t.*"
			   +"\tFROM (SELECT * FROM Article ORDER BY art_seq DESC) t) t2"
			   +"\tWHERE t2.seq BETWEEN %s AND %s", String.valueOf(pageArr[0]), String.valueOf(pageArr[1]));
		
		return listAll;
	}

	@Override
	public int update(Article param) throws Exception {
		String sql = "";
		return 0;
	}

	@Override
	public int delete(Article param) throws Exception {
		String sql = String.format("DELETE FROM Article WHERE art_seq='%s'", param.getSeq());
	
		return 0;
	}
	@Override
	public int count() {
		int count = 0;
		String sql = "SELECT COUNT(*) AS count FROM Article";
		
		return count;
	}
}
