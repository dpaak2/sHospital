package com.hospital.web.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hospital.web.dao.BoardDAO;
import com.hospital.web.domain.Article;
import com.hospital.web.service.BoardService;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired BoardService sevice;
	@Autowired BoardDAO dao;
	@Override
	public int add(Article param) throws Exception{
		int rs = dao.insert(param);
		return rs;
	}

	@Override
	public Article findOne(Article param) throws Exception{
		Article article = dao.selectBySeq(param);
		return article;
	}

	@Override
	public List<Article> findSome(String[] param) throws Exception{
		List<Article> listSome = new ArrayList<>();
		System.out.println("���񽺿� �Ѿ �Ķ����1:"+param[0]);
		System.out.println("���񽺿� �Ѿ �Ķ����1:"+param[1]);
		listSome = dao.selectByWord(param);
		System.out.println("���񽺿��� �� ����Ʈ���:"+listSome);
		return listSome;
	}

	@Override
	public List<Article> list(int[] pageArr){
		List<Article> listAll = dao.selectAll(pageArr);
		return listAll;
	}

	@Override
	public int update(Article param) throws Exception{
		int rs = dao.update(param);
		return rs;
	}

	@Override
	public int delete(Article param) throws Exception{
		int rs = dao.delete(param);
		return rs;
	}
	@Override
	public int count() {
		return dao.count();
	}
}
