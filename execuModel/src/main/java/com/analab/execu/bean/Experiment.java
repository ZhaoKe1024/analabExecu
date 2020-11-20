package com.analab.execu.bean;

public class Experiment {
    private String experid;

    private String name;

    private String subject;

    private String field;

    private String author;

    private String experission;

    public String getExperid() {
        return experid;
    }

    public void setExperid(String experid) {
        this.experid = experid == null ? null : experid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getExperission() {
        return experission;
    }

    public void setExperission(String experission) {
        this.experission = experission == null ? null : experission.trim();
    }
}