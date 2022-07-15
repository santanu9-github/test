package com.trackcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trackcrm.entity.Contact;
import com.trackcrm.entity.Lead;
import com.trackcrm.service.ContactService;
import com.trackcrm.service.LeadService;

@Controller
public class LeadController {
@Autowired	
private LeadService leadService;
@Autowired
private ContactService contactService;
@RequestMapping("/viewleadpage")
public String viewLeadPage() {
	return"view_lead_page";
}
@RequestMapping("/savelead")
public String saveLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
	Lead leads = leadService.saveOneLead(lead);
	model.addAttribute("lead",leads);
	return"lead_info";
}
@RequestMapping("/convertlead")
public String convertLead(@RequestParam("id")long id,ModelMap model) {
	Lead lead = leadService.getLeadById(id);
	Contact contact=new Contact();
	contact.setFirstName(lead.getFirstName());
	contact.setLastName(lead.getLastName());
	contact.setEmail(lead.getEmail());
	contact.setMobile(lead.getMobile());
	contact.setLeadSource(lead.getLeadSource());
	contact.setGender(lead.getGender());
	contactService.saveContact(contact);
	leadService.deleteById(id);
	List<Contact> contacts = contactService.contactAll();
	model.addAttribute("contact",contacts);
	return"contact_search_result";
}
@RequestMapping("/listall")
public String allLead(ModelMap model) {
	List<Lead> leads = leadService.leadAll();	
	model.addAttribute("leads",leads);
	return"lead_search_result";	
}
@RequestMapping("/getLeadById")
public String getLeadById(@RequestParam("id")long id,ModelMap model) {
	Lead lead = leadService.getLeadById(id);
	model.addAttribute("lead",lead);
	return"lead_info";
}




}

