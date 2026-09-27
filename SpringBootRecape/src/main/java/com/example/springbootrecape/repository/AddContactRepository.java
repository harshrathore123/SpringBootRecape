package com.example.springbootrecape.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springbootrecape.entities.AddContact;

public interface AddContactRepository extends JpaRepository<AddContact, Integer> {

}