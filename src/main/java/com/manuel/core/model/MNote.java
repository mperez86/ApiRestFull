package com.manuel.core.model;

import com.manuel.core.entity.Note;

public class MNote {
	
	public MNote() {
		
	}
	
	public MNote(Note note) {
		this.id = note.getId();
		this.name = note.getName();
		this.title = note.getTitle();
		this.content = note.getContent();
	}
	
	public MNote(long id, String name, String title, String content) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
	}

	private long id;
	
	private String name;
	
	private String title;
	
	private String content;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
