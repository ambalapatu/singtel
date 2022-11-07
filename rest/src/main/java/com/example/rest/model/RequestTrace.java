package com.example.rest.model;

import javax.persistence.*;

@Entity
@Table(name = "request_trace")
public class RequestTrace {
	
	public RequestTrace() {

	}
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "url")
	private String url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
