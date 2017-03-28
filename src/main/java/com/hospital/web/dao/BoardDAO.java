package com.hospital.web.dao;
import java.util.List;
import com.hospital.web.domain.Article;
public interface BoardDAO {
	public int insert(Article param) throws Exception;
	public Article selectBySeq(Article param) throws Exception;
	public List<Article> selectByWord(String[] param) throws Exception;
	public List<Article> selectAll(int[] pageArr);
	public int update(Article param) throws Exception;
	public int delete(Article param) throws Exception;	
	public int count() ;
}
