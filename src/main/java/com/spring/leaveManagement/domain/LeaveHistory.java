package com.spring.leaveManagement.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "leave_history")
public class LeaveHistory {

	@Id
	private String employeeId;
	
	@Field("leave_type")
	private String leaveType;
	
	@Field("from")
	private String fromDate;
	
	@Field("to")
	private String toDate;
	
	@Field("total_days")
	private int totalDays;
	
	@Field("reason_for_leave")
	private String reasonForLeave;

	public LeaveHistory() {
		super();
	}

	public LeaveHistory(String employeeId, String leaveType, String fromDate, String toDate, int totalDays,
			String reasonForLeave) {
		super();
		this.employeeId = employeeId;
		this.leaveType = leaveType;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.totalDays = totalDays;
		this.reasonForLeave = reasonForLeave;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public String getReasonForLeave() {
		return reasonForLeave;
	}

	public void setReasonForLeave(String reasonForLeave) {
		this.reasonForLeave = reasonForLeave;
	}

	@Override
	public String toString() {
		return "LeaveHistory [employeeId=" + employeeId + ", leaveType=" + leaveType + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", totalDays=" + totalDays + ", reasonForLeave=" + reasonForLeave + "]";
	}
	
}
