package com.shrueekatech.ShrueeKaTechPhneBookApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shrueekatech.ShrueeKaTechPhneBookApp.Entities.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
