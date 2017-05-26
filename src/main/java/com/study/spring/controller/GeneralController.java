package com.study.spring.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.spring.listener.SpringContextLoaderListener;

/**
 * 标题: GeneralController.java 作者: 王昭峰 Copyright: Copyright(c) 2007 公司:
 * 杭州创盾科技有限公司 日期: 2017年5月25日 下午3:40:27 版本: 1.0 描述:
 */
@Controller
public class GeneralController {
	protected final static Log log = LogFactory.getLog(GeneralController.class);
	
	@RequestMapping(value = "index.do") 
	public ModelAndView index_jsp(Model model) {
		ModelAndView mv = new ModelAndView();
		model.addAttribute("str0121", "Hellow world");
		System.out.println("index.jsp");
		return mv;
	}
	public void generalCo(){
	  log.info("这是控制器方法！");
	}
	@Override
	public String toString() {
		 log.error("fffffffffffff");
		 log.info("444444444444444444444");
		return super.toString();
	}
	
	
}
