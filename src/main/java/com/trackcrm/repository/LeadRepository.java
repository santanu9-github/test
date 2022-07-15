package com.trackcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trackcrm.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
