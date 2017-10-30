package com.revature.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SHIP")
public class Ship implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3101324527173897008L;

	@OneToMany(mappedBy = "crewMemberShip", fetch = FetchType.EAGER)
	Set<CrewMember> CrewMember = new HashSet<CrewMember>();

	@Id
	@Column(name = "S_ID")
	int ShipId;

	@Column(name = "S_NAME")
	String ShipName;

	@Column(name = "S_WARPSPEED")
	int ShipWarpSpeed;

	public Ship() {
		super();
	}

	public Ship(Set<CrewMember> bankTx, int shipId, String shipName, int shipWarpSpeed) {
		super();
		this.CrewMember = bankTx;
		ShipId = shipId;
		ShipName = shipName;
		ShipWarpSpeed = shipWarpSpeed;
	}

	public Set<CrewMember> getBankTx() {
		return CrewMember;
	}

	public void setBankTx(Set<CrewMember> bankTx) {
		this.CrewMember = bankTx;
	}

	public int getShipId() {
		return ShipId;
	}

	public void setShipId(int shipId) {
		ShipId = shipId;
	}

	public String getShipName() {
		return ShipName;
	}

	public void setShipName(String shipName) {
		ShipName = shipName;
	}

	public int getShipWarpSpeed() {
		return ShipWarpSpeed;
	}

	public void setShipWarpSpeed(int shipWarpSpeed) {
		ShipWarpSpeed = shipWarpSpeed;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Ship [ShipId=" + ShipId + ", ShipName=" + ShipName + ", ShipWarpSpeed="
				+ ShipWarpSpeed + "]";
	}

}
