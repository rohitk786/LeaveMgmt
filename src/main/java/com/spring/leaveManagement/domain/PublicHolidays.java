package com.spring.leaveManagement.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "public_holidays")
public class PublicHolidays {

	@Id
	private String publicHolidayId;
	
	@Field("holiday_name")
	private String name;
	
	@Field("holiday_date")
	private String date;

	public PublicHolidays() {
		super();
	}

	public PublicHolidays(String publicHolidayId, String name, String date) {
		super();
		this.publicHolidayId = publicHolidayId;
		this.name = name;
		this.date = date;
	}

	public String getPublicHolidayId() {
		return publicHolidayId;
	}

	public void setPublicHolidayId(String publicHolidayId) {
		this.publicHolidayId = publicHolidayId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "PublicHolidays [publicHolidayId=" + publicHolidayId + ", name=" + name + ", date=" + date + "]";
	}
	
}
