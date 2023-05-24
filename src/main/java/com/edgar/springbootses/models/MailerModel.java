package com.edgar.springbootses.models;

import lombok.Data;

@Data
public class MailerModel {
	
	private String emailFrom;
	
	private String emailTo;
	
	private String subject;
	
	private String message;

}
