package com.edgar.springbootses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.springbootses.models.MailerModel;
import com.edgar.springbootses.services.SESMailService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MailController {

	private final SESMailService mailService;

	@GetMapping("/sendmail")
	public String sendMessage(@RequestBody MailerModel mailerModel) {

		mailService.sendEmail(mailerModel);

		return "Mail sent successfully";

	}

}
