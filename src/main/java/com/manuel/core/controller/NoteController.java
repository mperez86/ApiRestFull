package com.manuel.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manuel.core.entity.Note;
import com.manuel.core.model.MNote;
import com.manuel.core.service.NoteService;

@RestController
@RequestMapping("/v1")
public class NoteController {

	@Autowired // inyectar
	@Qualifier("noteservice") // decimos como se llama el bean
	private NoteService service;
	
	@PutMapping("/nota")
	public boolean addNote(@RequestBody @Valid Note note) {
		return service.create(note);
	}
	
	@PostMapping("/nota")
	public boolean updateNote(@RequestBody @Valid Note note) {
		return service.update(note);
	}
	
	@DeleteMapping("/nota/{id}")
	public boolean deleteNote(@PathVariable("id") long id) { 
//			@PathVariable("name") String name) {
		return service.delete(id);
	}
	
	@GetMapping("notas")
	public List<MNote> getNotes() {
		return service.getNotes();
	}
	
	@GetMapping("nota/{id}")
	public MNote getNoteById(@PathVariable("id") long id) {
		return service.getById(id);
	}
	
}
