package org.acme.service.impl;

import org.acme.model.Note;
import org.acme.service.NoteService;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.Collection;

@Transactional
@ApplicationScoped
public class NoteServiceImpl implements NoteService {

    @Override
    public Collection<Note> getAllNotes() {
        return Note.listAll();
    }

    @Override
    public void save(String note) {
        Note toSave = new Note();
        toSave.setNote(note);

        Note.persist(toSave);
    }

    @Override
    public void deleteById(Long id) {
        Note.deleteById(id);
    }

    @Override
    public void deleteAll() {
        Note.deleteAll();
    }
}
