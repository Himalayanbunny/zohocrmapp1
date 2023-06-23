package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;

public interface ContactService {
public void saveContact(Contact contact);

public List<Contact> getAllContacts();

public Contact findContactById(long id);

public Contact getContactById(long id);
}
