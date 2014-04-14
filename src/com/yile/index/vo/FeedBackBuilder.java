package com.yile.index.vo;

import java.util.Date;


public class FeedBackBuilder{
	
	FeedBack fb = new FeedBack();
	
	public FeedBackBuilder setId(int id) {
		fb.setId(id);
		return this;
	}
	
	public FeedBackBuilder setFdContext(String fdContext) {
		fb.setFdContext(fdContext);
		return this;
	}

	public FeedBackBuilder setConnect(String connect) {
		fb.setConnect(connect);
		return this;
	}

	public FeedBackBuilder setCompanyName(String companyName) {
		fb.setCompanyName(companyName);
		return this;
	}

	public FeedBackBuilder setSubmitTime(Date submitTime) {
		fb.setSubmitTime(submitTime);
		return this;
	}
	
	public FeedBack toFeedBack() {
		return fb;
	}
	
}
