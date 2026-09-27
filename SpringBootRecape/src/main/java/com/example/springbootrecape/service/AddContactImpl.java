package com.example.springbootrecape.service;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springbootrecape.entities.AddContact;
import com.example.springbootrecape.repository.AddContactRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service 
public class AddContactImpl implements AddContactService{
    private final AddContactRepository addContactRepository;

    public AddContactImpl(AddContactRepository addContactRepository) {
		super();
		this.addContactRepository = addContactRepository;
	}

	@Override 
    public AddContact saveContact(AddContact addContact) {
        return addContactRepository.save(addContact);
    }

	@Override
	public AddContact getContact(Integer id) {
		Optional<AddContact> contact = this.addContactRepository.findById(id);		
		
		if(contact.isPresent()) {
			AddContact addcontact = contact.get();
			return addcontact;
		}
		
		return null;		
	}

}
