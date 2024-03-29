package com.henrique.Email.API.controller;

import com.henrique.Email.API.model.EmailDetails;
import com.henrique.Email.API.model.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public ResponseEntity sendMail(@RequestBody EmailDetails details) {
       try {
           String result = emailService.sendMail(details);
           return ResponseEntity.ok(result);
       } catch (Exception ex) {
           return ResponseEntity.badRequest().body("Error while Sending Mail");
       }
    }

    @PostMapping("/sendMailWithAttachment")
    public ResponseEntity sendMailWithAttachment(@RequestBody EmailDetails details) {
        try {
            String result = emailService.sendMailWithAttachment(details);
            return ResponseEntity.ok(result);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("Error while Sending Mail");
        }
    }
}
