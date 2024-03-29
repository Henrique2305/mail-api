package com.henrique.Email.API.service;

import com.henrique.Email.API.model.EmailDetails;
import com.henrique.Email.API.model.EmailService;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    @Override
    public String sendMail(EmailDetails emailDetails) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(sender);
        message.setTo(emailDetails.getTo());
        message.setSubject(emailDetails.getSubject());
        message.setText(emailDetails.getBody());

        javaMailSender.send(message);
        return "Mail Sent Successfully...";
    }

    @Override
    public String sendMailWithAttachment(EmailDetails emailDetails) throws Exception {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;

        helper = new MimeMessageHelper(mimeMessage, true);

        helper.setFrom(sender);
        helper.setTo(emailDetails.getTo());
        helper.setSubject(emailDetails.getSubject());
        helper.setText(emailDetails.getBody());

        FileSystemResource file = new FileSystemResource(new File(emailDetails.getAttachment()));
        helper.addAttachment(file.getFilename(), file);

        javaMailSender.send(mimeMessage);
        return "Mail Sent Successfully...";
    }
}
