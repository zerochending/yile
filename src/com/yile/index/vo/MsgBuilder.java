package com.yile.index.vo;

import java.util.Date;


public class MsgBuilder{
	
	private Msg msg = new Msg();
	
	public MsgBuilder setId(int id) {
		msg.setId(id);
		return this;
	}

	public MsgBuilder setMsgTitle(String msgTitle) {
		msg.setMsgTitle(msgTitle);
		return this;
	}

	public MsgBuilder setReleaseName(String releaseName) {
		msg.setReleaseName(releaseName);
		return this;
	}

	public MsgBuilder setReleaseTime(Date releaseTime) {
		msg.setReleaseTime(releaseTime);
		return this;
	}

	public MsgBuilder setRemark(String remark) {
		msg.setRemark(remark);
		return this;
	}
	
	public MsgBuilder setMsgContenxt(String msgContenxt) {
		msg.setMsgContenxt(msgContenxt);
		return this;
	}

	public Msg getMsg() {
		return msg;
	}
	
}
