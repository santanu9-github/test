package com.trackcrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trackcrm.entity.Billing;
import com.trackcrm.entity.Contact;
import com.trackcrm.service.BillingService;
import com.trackcrm.service.ContactService;

@Controller
public class BillingController {
@Autowired
private ContactService contactService;
@Autowired
private BillingService billingService;

@RequestMapping("/generatebillingid")
public String billingPage(@RequestParam("id")long id,ModelMap model) {
	Contact contact = contactService.getContactById(id);
	 model.addAttribute("contact",contact);
	 return"billing_page";
}
@RequestMapping("/savebill")
public String saveBilling(@ModelAttribute("bill")Billing bill,ModelMap model) {
	billingService.billOneLead(bill);
	model.addAttribute("save","complete the bill");
	return"billing_page";
}
}
