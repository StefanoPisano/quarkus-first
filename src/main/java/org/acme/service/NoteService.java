package org.acme.service;

import org.acme.model.Note;

import java.util.Collection;

public interface NoteService {

    Collection<Note> getAllNotes();

    void save(String note);

    void deleteById(Long id);

    void deleteAll();
}
