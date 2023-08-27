package com.example.cms.service;

import com.example.cms.client.MailgunClient;
import com.example.cms.client.mailgun.SendMailForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEmail() {
        SendMailForm form = SendMailForm.builder()
                .from("dbflek10@gmail.com")
                .to("jyooori2092@gmail.com")
                .subject("Test email from zero base")
                .text("my text email test")
                .build();

        return mailgunClient.sendEmail(form).getBody();
    }
}
