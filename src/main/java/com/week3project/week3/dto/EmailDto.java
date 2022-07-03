package com.week3project.week3.dto;

public class EmailDto {
    private String emailTo;
    private String title;
    private String email;
    private String content;

    public EmailDto(String emailTo, String title, String email, String content) {
        super();
        this.emailTo = emailTo;
        this.title = title;
        this.email = email;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
