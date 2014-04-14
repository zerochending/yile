package com.yile.index.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.yile.base.BaseAction;
import com.yile.base.Constant;
import com.yile.base.ResMsg;
import com.yile.index.dao.IndexDao;
import com.yile.index.util.PrintUtils;
import com.yile.index.vo.FeedBack;
import com.yile.index.vo.FeedBackBuilder;
import com.yile.index.vo.Msg;
import com.yile.index.vo.Page;


public class IndexAction extends BaseAction{
	
	public static final Logger log = Logger.getLogger("indexlog"); 
	
	@Autowired
	private IndexDao indexDao;
	
	public String index(HttpServletRequest request, HttpServletResponse response){
		
		return "index/index";
		
	}
	
	//news 
    public void getnews(HttpServletRequest request, HttpServletResponse response){
    	
    	try{
			String pageNoStr = request.getParameter("p");
			int pageNo = 1;
			if(StringUtils.isNotBlank(pageNoStr)) {
				pageNo = Integer.valueOf(pageNoStr);
			}
			
			int totalNum = indexDao.totalNews();
			List<Msg> list = indexDao.queryNews(new Page<Msg>(pageNo,totalNum));
			if(list!=null) {
				Page<Msg> p = new Page<Msg>(pageNo,totalNum);
				p.setList(list);
				PrintUtils.writeOut(response, new ResMsg<Page<Msg>>(true,p));
			}
			
			PrintUtils.writeOut(response,new ResMsg<String>(false,Constant.FAIL));
		}catch(Exception e) {
			log.error("MsgAction.query:",e);
		}
		
	}
    
    public void getnewsById(HttpServletRequest request, HttpServletResponse response){
    	String msgId = request.getParameter("msgId");
    	if(StringUtils.isNotBlank(msgId)) {
    		PrintUtils.writeOut(response, new ResMsg<String>(false,"msg id is null"));
    		return;
		}
    	Msg msg = indexDao.queryNewsById(Integer.valueOf(msgId));
    	if(msg!=null) {
    		PrintUtils.writeOut(response,new ResMsg<Msg>(true,msg));
    	}else {
    		PrintUtils.writeOut(response,new ResMsg<String>(false,"msg is null by id "+msgId));
    	}
    }
	
    //insert fb
    public void subFeedBack(HttpServletRequest request, HttpServletResponse response){
		
    	String fdContext = request.getParameter("fdContext");
    	String connect = request.getParameter("connect");
    	String companyName = request.getParameter("companyName");
    	FeedBack fb = new FeedBackBuilder().setCompanyName(companyName).setConnect(connect)
    			                           .setFdContext(fdContext).setSubmitTime(new Date()).toFeedBack();
    	
    	int res = indexDao.insertFb(fb);
    	if(res>0) {
    		PrintUtils.writeOut(response,new ResMsg<Integer>(true,res));
    	}else {
    		PrintUtils.writeOut(response,new ResMsg<Integer>(false,res));
    	}
		
   	}
}
