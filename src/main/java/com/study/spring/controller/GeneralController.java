package com.study.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 标题: GeneralController.java 作者: 王昭峰 Copyright: Copyright(c) 2007 公司:
 * 杭州创盾科技有限公司 日期: 2017年5月25日 下午3:40:27 版本: 1.0 描述:
 */
@Controller
public class GeneralController {
	@RequestMapping(value = "index.do") 
	public ModelAndView index_jsp(Model model) {
		ModelAndView mv = new ModelAndView();
		model.addAttribute("str0121", "Hellow world");
		System.out.println("index.jsp");
		return mv;
	}
}
