package com.example.springbootrecape.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootrecape.entities.AddContact;
import com.example.springbootrecape.service.AddContactService;

@RestController 
public class ContactController {
    private final AddContactService addContactService;
    
    public ContactController(AddContactService addContactService) {
        this.addContactService = addContactService;
    }

    @PostMapping("/addContact")
    public AddContact addContact(@RequestBody AddContact addContact) {
        return this.addContactService.saveContact(addContact);
    }
    
    @GetMapping("/getContact/{id}")
    public AddContact getContact(@PathVariable("id") Integer id) {
    	return this.addContactService.getContact(id);
    }
    
}
