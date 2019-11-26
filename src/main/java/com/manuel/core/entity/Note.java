package com.manuel.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.io.Serializable;

import javax.persistence.Column;

@Table(name="NOTE")
@Entity
public class Note implements Serializable {
	// se extiende serializable para hacer la conversión a hibernate

	/**
	 * Constructor
	 */
	public Note() {
		
	}
	
	public Note(long id, String name, String title, String content) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
	}

	@GeneratedValue
	@Id
	@Column(name="ID")
	private long id;
	
	/**
	 * 
	 */
	@Column(name="NAME")
	private String name;
	
	/**
	 * 
	 */
	@Column(name="TITLE")
	private String title;
	
	/**
	 * 
	 */
	@Column(name="CONTENT")
	private String content;

	/**
	 * @return
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
}