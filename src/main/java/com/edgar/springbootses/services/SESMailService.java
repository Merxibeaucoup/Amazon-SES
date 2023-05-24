package com.edgar.springbootses.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.edgar.springbootses.models.MailerModel;

@Service
public class SESMailService {

	@Autowired
	private MailSender mailSender;

	/* send ses */
	public void send(SimpleMailMessage mailMessage) {
		this.mailSender.send(mailMessage);
	}

	/* send email */
	public void sendEmail(MailerModel mailerModel) {

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(mailerModel.getEmailFrom());
		simpleMailMessage.setTo(mailerModel.getEmailTo());
		simpleMailMessage.setSubject(mailerModel.getSubject());
		simpleMailMessage.setText(mailerModel.getMessage());

		send(simpleMailMessage);

	}

}
