package org.acme;

import org.acme.dto.NoteDto;
import org.acme.model.Note;
import org.acme.service.NoteService;

import javax.ws.rs.*;
import java.util.Collection;

@Path("/note")
public class NoteResource {

    private NoteService noteService;

    public NoteResource(NoteService noteService) {
        this.noteService = noteService;
    }

    @GET
    @Path("/all")
    public Collection<Note> getNotes(){
        return noteService.getAllNotes();
    }

    @POST
    public void saveNote(NoteDto noteDto) {
        noteService.save(noteDto.getNote());
    }

    @DELETE
    @Path("/{id}")
    public void deleteNote(Long id) {
        noteService.deleteById(id);
    }

    @DELETE
    @Path("/all")
    public void deleteAll() {
        noteService.deleteAll();
    }
}