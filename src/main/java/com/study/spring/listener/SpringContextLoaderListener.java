package com.study.spring.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.study.spring.controller.GeneralController;

/**
 * 标题: SpringContextLoaderListener.java 作者: 王昭峰 Copyright: Copyright(c) 2007 公司:
 * 杭州创盾科技有限公司 日期: 2017年5月25日 下午4:22:21 版本: 1.0 描述:
 */
public class SpringContextLoaderListener extends ContextLoaderListener {
	protected final static Log log = LogFactory.getLog(SpringContextLoaderListener.class);
	private static ApplicationContext ctx = null;

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		super.contextInitialized(event);
		ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
		ServletContext context = event.getServletContext();
	
	}
	// 获取 spring bean
		public static Object getBean(String bean) {
			return ctx.getBean(bean);
		}
		
		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			System.out.println("11   "+ctx);
			GeneralController bean = (GeneralController) ctx.getBean("generalController");
			System.out.println(bean.toString());
		}
}
