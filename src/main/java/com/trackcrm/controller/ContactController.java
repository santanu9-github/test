package com.trackcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trackcrm.entity.Contact;
import com.trackcrm.service.ContactService;

@Controller
public class ContactController {
@Autowired
private ContactService contactSrvice;
	
@RequestMapping("/contactall")
public String contactAll(ModelMap model ) {
	List<Contact> contacts = contactSrvice.contactAll();
	model.addAttribute("contact",contacts);
	return"contact_search_result";
}
@RequestMapping("/getContactById")
public String getContactById(@RequestParam("id")long id,ModelMap model) {
	Contact contact = contactSrvice.getContactById(id);
	model.addAttribute("contact",contact);
	return"contact_info";
}
}
