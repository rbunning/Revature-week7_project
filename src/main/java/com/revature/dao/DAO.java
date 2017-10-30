package com.revature.dao;

import java.util.List;

import com.revature.bean.CrewMember;

public interface DAO {
	
	public CrewMember getCrewMemberById(CrewMember member);
	
	public void saveCrewMemberById(CrewMember member);

}
