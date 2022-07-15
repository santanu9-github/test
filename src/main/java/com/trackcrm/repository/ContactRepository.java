package com.trackcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trackcrm.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
