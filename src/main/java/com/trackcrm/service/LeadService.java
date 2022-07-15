package com.trackcrm.service;

import java.util.List;

import com.trackcrm.entity.Lead;

public interface LeadService {

	public Lead saveOneLead(Lead lead);

	public Lead getLeadById(long id);

	public void deleteById(long id);
    public List<Lead>leadAll();

}
