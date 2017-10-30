package com.revature.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POSITION")
public class Position implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6051364078115220791L;

	@Id
	@Column(name="P_ID")
	int postionId;
	
	@Column(name="P_NAME")
	String postionName;

	public Position() {
		super();
	}

	public Position(int postionId, String postionName) {
		super();
		this.postionId = postionId;
		this.postionName = postionName;
	}

	public int getPostionId() {
		return postionId;
	}

	public void setPostionId(int postionId) {
		this.postionId = postionId;
	}

	public String getPostionName() {
		return postionName;
	}

	public void setPostionName(String postionName) {
		this.postionName = postionName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Position [postionId=" + postionId + ", postionName=" + postionName + "]";
	}

}
