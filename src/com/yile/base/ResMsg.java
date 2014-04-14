package com.yile.base;

import com.yile.index.util.JSONTools;

public class ResMsg<T>{

	private boolean success;
	private T t;
	
	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	public ResMsg(){}
	public ResMsg(boolean success, T t){
		this.success = success;
		this.t = t;
	}
	
	public String toString() {
		return JSONTools.TO_JSON(this);
	}
	
}
