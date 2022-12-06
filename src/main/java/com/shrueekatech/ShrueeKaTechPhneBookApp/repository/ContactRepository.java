package com.shrueekatech.ShrueeKaTechPhneBookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrueekatech.ShrueeKaTechPhneBookApp.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
