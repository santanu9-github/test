package com.trackcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trackcrm.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing,Long> {

}
