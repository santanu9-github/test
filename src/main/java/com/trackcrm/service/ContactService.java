package com.trackcrm.service;

import java.util.List;

import com.trackcrm.entity.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	public List<Contact> contactAll();

	public Contact getContactById(long id);

}
