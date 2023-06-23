package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Email;
import com.zohocrm.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	@PostMapping("/sendEmail")
	public String getEmailId(@RequestParam("email")String email,Model model) {
		model.addAttribute("email", email);
		
		return"composse_email";
	}
	@PostMapping("/triggerEmail")
	public String triggerEmail(Email email,Model model) {
		emailService.sendEmail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg","email sent");
		return"composse_email";
	}

}
