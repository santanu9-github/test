package com.trackcrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackcrm.entity.Billing;
import com.trackcrm.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
@Autowired
private BillingRepository billingRepo;
	@Override
	public void billOneLead(Billing bill) {
		billingRepo.save(bill);
	}

}
