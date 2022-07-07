package com.hoon.bmi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String config = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		
		myInfo.getMyInfo();
		
		ctx.close();
	}

}
