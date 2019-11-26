package com.manuel.core.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.manuel.core.entity.Note;

@Repository("noterepository")
public interface NoteRepository extends JpaRepository<Note, Serializable> {

	public abstract Note findByName(String name);
	
	public abstract List<Note> findByTitle(String title);
	
	public abstract Note findByNameAndTitle(String name, String title);
	
	public abstract Note findById(long id);
}
