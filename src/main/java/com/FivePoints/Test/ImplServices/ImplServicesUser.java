package com.FivePoints.Test.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.Test.Entities.Utilisateur;
import com.FivePoints.Test.Repositery.RepositeryUser;
import com.FivePoints.Test.Service.ServiceUser;

@Service("ImplServicesUser")
public class ImplServicesUser implements ServiceUser{

	@Autowired
	RepositeryUser repositeryUser;

	@Override
	public void AddUser(Utilisateur user) {
		repositeryUser.save(user);
		
	}

	@Override
	public List<Utilisateur> find() {
		 
		return repositeryUser.findAll();
	}

	@Override
	public Utilisateur getById(int id) {
	 
		return repositeryUser.getOne(id);
	}

	@Override
	public void update(Utilisateur u) {
		repositeryUser.save(u);
		
	}

	@Override
	public boolean login(String login, String passwd) {
		 
		if( repositeryUser.login(login, passwd)!=null)
		{
			return true;
		}
		return false;
	}
}
