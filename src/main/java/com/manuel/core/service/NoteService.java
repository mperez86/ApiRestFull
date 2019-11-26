package com.manuel.core.service;

import org.springframework.stereotype.Service;

import com.manuel.core.converter.Convert;
import com.manuel.core.entity.Note;
import com.manuel.core.model.MNote;
import com.manuel.core.repository.NoteRepository;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Service("noteservice")
public class NoteService {
	
	@Autowired // inyectar
	@Qualifier("noterepository") // decimos como se llama el bean
	private NoteRepository repo;
	
	@Autowired // inyectar
	@Qualifier("noteconvert") // decimos como se llama el bean
	private Convert convert;
	
	private static final Log logger = LogFactory.getLog(NoteService.class);
	
	public boolean create(Note note) {
		logger.info("Creando una nota");
		try {
			repo.save(note);
			logger.info("Nota creada");
			return true;
		}catch(Exception e) {
			logger.error("Error al crear la nota");
			return false;
		}
	}
	
	public boolean update(Note note) {

		try {
			repo.save(note);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean delete(long id) {

		try {
			Note note = repo.findById(id);
			repo.delete(note);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<MNote> getNotes() {	
		return convert.convertList(repo.findAll());
	}
	
	public MNote getByNameAndTitle(String name, String title) {
		return new MNote(repo.findByNameAndTitle(name, title));
	}
	
	public MNote getById(long id) {
		return new MNote(repo.findById(id));
	}
	
	public List<MNote> getByTitle(String title) {
		return convert.convertList(repo.findByTitle(title));
	}
	
}
