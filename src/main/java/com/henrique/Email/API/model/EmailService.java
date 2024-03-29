package com.henrique.Email.API.model;

public interface EmailService {

    String sendMail(EmailDetails emailDetails);

    String sendMailWithAttachment(EmailDetails emailDetails) throws Exception;

}
