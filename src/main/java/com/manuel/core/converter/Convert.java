package com.manuel.core.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.manuel.core.entity.Note;
import com.manuel.core.model.MNote;

@Component("noteconvert")
public class Convert {

	public List<MNote> convertList(List<Note> notes) {
		List<MNote> mnotes = new ArrayList<>();
		
		for (Note note : notes) {
			mnotes.add(new MNote(note));
		}
		return mnotes;
	}
}
