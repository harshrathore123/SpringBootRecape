package com.example.springbootrecape.service;

import com.example.springbootrecape.entities.AddContact;

public interface AddContactService {
    AddContact saveContact(AddContact addContact);
    
    AddContact getContact(Integer id);

}
