package com.yile.index.vo;

import java.util.List;

import com.yile.base.Constant;
import com.yile.index.util.JSONTools;


public class Page<T>{
	
	private int pageSize = Constant.PAGE_SIZE;
	private int pageNo;
	private List<T> list;
	private int index;
	private int totalPage;
	private int totalNum;
	
	public Page(int pageNo, int totalNum) {
		this.totalNum = totalNum;
		this.pageNo = pageNo-1;
	}
	
	public int getTotalNum() {
		return totalNum;
	}

	public int getTotalPage() {
		this.totalPage = totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
		return totalPage;
	}

	public int getIndex() {
		index = this.pageNo*this.pageSize;
		return index;
	}

	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	public String toString() {
		return JSONTools.TO_JSON(this);
	}

}
