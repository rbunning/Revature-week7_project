package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.bean.CrewMember;
import com.revature.service.AppService;
import com.revature.service.AppServiceImpl;

public class Driver {

	private static AppService app;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextold.xml");
		app = (AppService) ac.getBean("appService");
		
		System.out.println(app.getCrewMemberById(new CrewMember(1, null, null, null, null)));
		//app.saveCrewMember(new CrewMember("Han", "Solo", );
		
	}
}
