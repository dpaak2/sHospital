package com.hospital.web.service;
import java.util.List;
import org.springframework.stereotype.Component;
import com.hospital.web.domain.Article;
@Component
public interface BoardService {
	public int add(Article param) throws Exception;
	public Article findOne(Article param) throws Exception;
	public List<Article> findSome(String[] param) throws Exception;
	public List<Article> list(int[] pageArr);
	public int update(Article param) throws Exception;
	public int delete(Article param) throws Exception;	
	public int count() ;
}
