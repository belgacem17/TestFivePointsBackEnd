package com.FivePoints.Test.Service;

import java.util.List;

import com.FivePoints.Test.Entities.Sujet; 

public interface ServiceSujet {

	public void AddSujet(Sujet sujet);
	public List<Sujet> find();
	public Sujet getById(int id);
	public void update(Sujet s);
	
}
