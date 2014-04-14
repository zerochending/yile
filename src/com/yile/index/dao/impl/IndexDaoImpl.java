package com.yile.index.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.yile.index.dao.IndexDao;
import com.yile.index.vo.FeedBack;
import com.yile.index.vo.Msg;
import com.yile.index.vo.Page;

public class IndexDaoImpl  extends SqlMapClientDaoSupport implements IndexDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Msg> queryNews(Page<Msg> page) {
		return (List<Msg>)this.getSqlMapClientTemplate().queryForList("index.queryNews",page);
	}

	@Override
	public int insertFb(FeedBack fb) {
		return (Integer)this.getSqlMapClientTemplate().insert("index.insertFb",fb);
	}

	@Override
	public int totalNews() {
		return (Integer)this.getSqlMapClientTemplate().queryForObject("index.totalNews");
	}

	@Override
	public Msg queryNewsById(int id) {
		return (Msg)this.getSqlMapClientTemplate().queryForObject("index.queryNewsById");
	}

}
