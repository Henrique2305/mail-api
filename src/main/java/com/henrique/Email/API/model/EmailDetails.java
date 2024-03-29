package com.henrique.Email.API.model;

public class EmailDetails {

    private String to;
    private String subject;
    private String body;
    private String attachment;

    public EmailDetails() {
    }

    public EmailDetails(String to, String subject, String body, String attachment) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.attachment = attachment;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getAttachment() {
        return attachment;
    }
}
