package com.yile.index.dao;

import java.util.List;

import com.yile.index.vo.FeedBack;
import com.yile.index.vo.Msg;
import com.yile.index.vo.Page;



public interface IndexDao {

	public List<Msg> queryNews(Page<Msg> page);
	
	public int insertFb(FeedBack fb);
	
	public int totalNews();
	
	public Msg queryNewsById(int id);
	
	
}
