package com.revature.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.revature.bean.CrewMember;

@Controller
public class TestCtrl {

	@RequestMapping(value = "/create")
	public String createCrewMemberAll() {
		System.out.println("MainCtrl create -all");
		return ("/static/create.html");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody ModelAndView createCrewMemberPost(CrewMember member, HttpServletRequest request) {
		System.out.println("MainCtrl create -post");
		System.out.println(member);
		
		return new ModelAndView("redirect:/home");
	}

	@RequestMapping(value = "/home")
	public String homeAll() {
		System.out.println("MainCtrl home -all");
		return ("/static/home.html");
	}

}
