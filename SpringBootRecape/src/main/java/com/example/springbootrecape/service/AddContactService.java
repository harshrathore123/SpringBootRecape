package com.example.springbootrecape.service;

import java.util.List;

import com.example.springbootrecape.entities.AddContact;

public interface AddContactService {
	AddContact saveContact(AddContact addContact);

	AddContact getContact(Integer id);

	List<AddContact> getAllContact();

	void DeleteContactById(Integer id);
	
	void DeleteAllContact();
	
	AddContact updateContact(Integer id,AddContact addContact);
}
