package com.edgar.springbootses.controller;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.springbootses.services.MailService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MailController {
	
	
	private final MailService mailService;
	
	@GetMapping("/sendmail")
	public String sendMessage(@RequestParam String fromEmail,
			@RequestParam String toEmail,
			@RequestParam String subject,
			@RequestParam String body) {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(fromEmail);
		simpleMailMessage.setTo(toEmail);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(body);
		
		mailService.sendMessage(simpleMailMessage);
		
		return "Mail sent successfully";
		
	}

}
