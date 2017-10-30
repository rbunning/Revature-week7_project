package com.revature.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CREW_MEMBER")
public class CrewMember implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2317052877011561217L;

	@Id
	@SequenceGenerator(sequenceName = "CREW_MEMBER_SEQ", name = "CM_SEQ")
	@GeneratedValue(generator = "CM_SEQ", strategy = GenerationType.SEQUENCE)
	@Column(name = "CM_ID")
	int crewMemberId;

	@Column(name = "CM_FN")
	String crewMemberFirstName;

	@Column(name = "CN_LN")
	String crewMemberKastName;

	@ManyToOne
	@JoinColumn(name = "P_ID")
	Position crewMemberPosition;

	@ManyToOne
	@JoinColumn(name = "S_ID")
	Ship crewMemberShip;

	public CrewMember() {
		super();
	}

	public CrewMember(String crewMemberFirstName, String crewMemberKastName, Position crewMemberPosition,
			Ship crewMemberShip) {
		super();
		this.crewMemberFirstName = crewMemberFirstName;
		this.crewMemberKastName = crewMemberKastName;
		this.crewMemberPosition = crewMemberPosition;
		this.crewMemberShip = crewMemberShip;
	}

	public CrewMember(int crewMemberId, String crewMemberFirstName, String crewMemberKastName,
			Position crewMemberPosition, Ship crewMemberShip) {
		super();
		this.crewMemberId = crewMemberId;
		this.crewMemberFirstName = crewMemberFirstName;
		this.crewMemberKastName = crewMemberKastName;
		this.crewMemberPosition = crewMemberPosition;
		this.crewMemberShip = crewMemberShip;
	}

	public int getCrewMemberId() {
		return crewMemberId;
	}

	public void setCrewMemberId(int crewMemberId) {
		this.crewMemberId = crewMemberId;
	}

	public String getCrewMemberFirstName() {
		return crewMemberFirstName;
	}

	public void setCrewMemberFirstName(String crewMemberFirstName) {
		this.crewMemberFirstName = crewMemberFirstName;
	}

	public String getCrewMemberKastName() {
		return crewMemberKastName;
	}

	public void setCrewMemberKastName(String crewMemberKastName) {
		this.crewMemberKastName = crewMemberKastName;
	}

	public Position getCrewMemberPosition() {
		return crewMemberPosition;
	}

	public void setCrewMemberPosition(Position crewMemberPosition) {
		this.crewMemberPosition = crewMemberPosition;
	}

	public Ship getCrewMemberShip() {
		return crewMemberShip;
	}

	public void setCrewMemberShip(Ship crewMemberShip) {
		this.crewMemberShip = crewMemberShip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CrewMember [crewMemberId=" + crewMemberId + ", crewMemberFirstName=" + crewMemberFirstName
				+ ", crewMemberKastName=" + crewMemberKastName + ", crewMemberPosition=" + crewMemberPosition
				+ ", crewMemberShip=" + crewMemberShip + "]";
	}

}
