package com.FivePoints.Test.Service;

import java.util.List;

import com.FivePoints.Test.Entities.Utilisateur; 

public interface ServiceUser {

	public  boolean login(String login, String passwd);
	public void AddUser(Utilisateur user);
	public List<Utilisateur> find();
	public Utilisateur getById(int id);
	public void update(Utilisateur u);
	
}
