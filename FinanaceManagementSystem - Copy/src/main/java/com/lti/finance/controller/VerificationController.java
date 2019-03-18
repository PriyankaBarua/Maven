package com.lti.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.finance.service.VerificationService;
@Controller
public class VerificationController {
	
	@Autowired
	public VerificationService verifyservice;

	@RequestMapping(path="/verifydoumentstatus", method=RequestMethod.GET)
	@Transactional
	public String updatestatus(@RequestParam("userId") int userId,@RequestParam("document_status") boolean document_status) {
		verifyservice.updateDocumentStatus(userId, document_status); 
		System.out.println("i am here to update status");
		return "/homepage.jsp";
	}
	@RequestMapping(path="/verifyfeestatus", method=RequestMethod.GET)
	@Transactional
	public String getstatus(@RequestParam("userId") int userId,@RequestParam("fee_status") boolean fee_status) {
		verifyservice.updateFeeStatus(userId, fee_status);
		System.out.println("i am here to update fee");
		return "/homepage.jsp";
	}
}
