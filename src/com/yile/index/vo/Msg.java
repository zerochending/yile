package com.yile.index.vo;


import java.util.Date;

import com.yile.index.util.JSONTools;


//新闻管理
public class Msg{
	
	private int id;
	private String msgTitle;
	private String releaseName;
	private Date releaseTime;
	private String remark;
	private String msgContenxt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public String getReleaseName() {
		return releaseName;
	}
	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getMsgContenxt() {
		return msgContenxt;
	}
	public void setMsgContenxt(String msgContenxt) {
		this.msgContenxt = msgContenxt;
	}
	
	public String toString() {
		return JSONTools.TO_JSON(this);
	}
}
