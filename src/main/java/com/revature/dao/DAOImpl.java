package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.bean.CrewMember;

@Repository
public class DAOImpl implements DAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CrewMember getCrewMemberById(CrewMember member) {
		Session session = sessionFactory.getCurrentSession();
		return (CrewMember) session.get(CrewMember.class, member.getCrewMemberId());
	}
	
	public void saveCrewMemberById(CrewMember member) {
		Session session = sessionFactory.getCurrentSession();
		session.save(member);
	}
}
