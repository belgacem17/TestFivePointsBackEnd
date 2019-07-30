package com.FivePoints.Test.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.Test.Entities.Sujet;
import com.FivePoints.Test.Repositery.RepositorySujet;
import com.FivePoints.Test.Service.ServiceSujet;

@Service("ImplServicesSujet")
public class ImplServicesSujet implements ServiceSujet{

	@Autowired
	RepositorySujet	 repositerySujet;

	@Override
	public void AddSujet(Sujet sujet) {
		repositerySujet.save(sujet);
		
	}

	@Override
	public List<Sujet> find() {
		 
		return repositerySujet.findAll();
	}

	@Override
	public Sujet getById(int id) {
		 
		return repositerySujet.getOne(id);
	}

	@Override
	public void update(Sujet s) {
		repositerySujet.save(s);
	}
}
