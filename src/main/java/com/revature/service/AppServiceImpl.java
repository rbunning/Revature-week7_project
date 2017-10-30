package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.bean.CrewMember;
import com.revature.dao.DAO;

@Service(value="appService")
@Transactional
public class AppServiceImpl implements AppService {

	@Autowired
	DAO dao;

	public CrewMember getCrewMemberById(CrewMember member) {
		return dao.getCrewMemberById(member);
	}
	
	public void saveCrewMember(CrewMember member) {
		dao.saveCrewMemberById(member);
	}

}
