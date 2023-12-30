package com.SeleniumExpress.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class clr[]= {AppConfiguration.class};
		return clr;
	}

	@Override
	protected String[] getServletMappings() {
		String str[]= {"/*"};
		return str;
	}

}
