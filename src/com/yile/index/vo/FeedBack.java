package com.yile.index.vo;


import java.util.Date;

import com.yile.index.util.JSONTools;


public class FeedBack{
	
	private int id;
	private String fdContext;
	private String connect;
	private String companyName;
	private Date submitTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFdContext() {
		return fdContext;
	}
	public void setFdContext(String fdContext) {
		this.fdContext = fdContext;
	}
	public String getConnect() {
		return connect;
	}
	public void setConnect(String connect) {
		this.connect = connect;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
	
	public String toString() {
		return JSONTools.TO_JSON(this);
	}
	
	
}
