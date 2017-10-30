package com.revature.service;

import java.util.List;

import com.revature.bean.CrewMember;

public interface AppService{
	
	public CrewMember getCrewMemberById(CrewMember member);
	
	public void saveCrewMember(CrewMember member);
	
}
