package com.spring.leaveManagement.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user_leaves")
public class UserLeave implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@Field("total_leaves")
	private int totalLeaves;
	
	@Field("leave_balance")
	private int leaveBalance;
	
	@Field("sick_leaves")
	private int sickLeaves;
	
	@Field("annual_leaves")
	private int annualLeaves;

	public UserLeave() {
		super();
	}

	public UserLeave(String id, int totalLeaves, int leaveBalance, int sickLeaves, int annualLeaves) {
		super();
		this.id = id;
		this.totalLeaves = totalLeaves;
		this.leaveBalance = leaveBalance;
		this.sickLeaves = sickLeaves;
		this.annualLeaves = annualLeaves;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTotalLeaves() {
		return totalLeaves;
	}

	public void setTotalLeaves(int totalLeaves) {
		this.totalLeaves = totalLeaves;
	}

	public int getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

	public int getSickLeaves() {
		return sickLeaves;
	}

	public void setSickLeaves(int sickLeaves) {
		this.sickLeaves = sickLeaves;
	}

	public int getAnnualLeaves() {
		return annualLeaves;
	}

	public void setAnnualLeaves(int annualLeaves) {
		this.annualLeaves = annualLeaves;
	}

	@Override
	public String toString() {
		return "UserLeave [id=" + id + ", totalLeaves=" + totalLeaves + ", leaveBalance=" + leaveBalance
				+ ", sickLeaves=" + sickLeaves + ", annualLeaves=" + annualLeaves + "]";
	}
	
	
	

}
