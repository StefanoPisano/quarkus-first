package org.acme.dto;

public class NoteDto {

    private String note;
    private Long id;

    public NoteDto(){}
    public NoteDto(String note, Long id) {
        this.note = note;
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
