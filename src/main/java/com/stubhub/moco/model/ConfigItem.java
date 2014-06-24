package com.stubhub.moco.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="configitem")
public class ConfigItem {
	@Id
	private String id;
	private String content;
	private Date date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public ConfigItem() {
		super();
	}
	
	public ConfigItem(String id, String content, Date date) {
		super();
		this.id = id;
		this.content = content;
		this.date = date;
	}
	
	public ConfigItem(String content, Date date) {
		super();
		this.content = content;
		this.date = date;
	}
}
