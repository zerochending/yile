package com.yile.base;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class BaseAction extends MultiActionController{
	
	private static final String URLPATH = "urlPath";
	private static final String URLPRE = "urlPre";
	
    private String urlPath;
	private String urlPre;
	
	public String getUrlPre() {
		return urlPre;
	}

	public void setUrlPre(String urlPre) {
		this.urlPre = urlPre;
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}
	
	public ModelMap initModelMap() {
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute(URLPRE,this.getUrlPre());
		modelMap.addAttribute(URLPATH, this.getUrlPath());
		return modelMap;
	}

}
