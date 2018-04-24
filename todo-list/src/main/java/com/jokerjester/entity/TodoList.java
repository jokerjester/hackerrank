package com.jokerjester.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class List {
	
	@Id
	String id;
	
	String date;
	String detail;
	
	public List() {
		
	}
	
	public List(String id, String date, String detail) {
		super();
		this.id = id;
		this.date = date;
		this.detail = detail;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "List [id=" + id + ", date=" + date + ", detail=" + detail + "]";
	}
	
	
}
