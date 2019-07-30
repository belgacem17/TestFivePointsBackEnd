package com.FivePoints.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.Test.Entities.Utilisateur;
import com.FivePoints.Test.Service.ServiceUser;

@RestController
@RequestMapping("user")
public class ControleUser {

	@Autowired
	ServiceUser serviceUser;

	@RequestMapping(value="/login/{login}/{mdp}",method=RequestMethod.GET)
	public boolean login(@PathVariable("login") String login, @PathVariable("mdp") String passwd) {

		if (serviceUser.login(login, passwd) == true) {
			return true;
		}

		return false;
	}

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String  addUtlisateur(@RequestBody Utilisateur util) {
		if (serviceUser.login(util.getLogin(), util.getPasswd()) == true) {
			 
			return "existe Login ";
		}
		serviceUser.AddUser(util);
		return "Succes";

	}
	
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return serviceUser.find();
	}
	
	@RequestMapping(value="/findbyId/{id}",method=RequestMethod.GET)
	public Utilisateur getById (@PathVariable("id") int id){
	
		return serviceUser.getById(id);
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update (@RequestBody Utilisateur util){
	
		 serviceUser.update(util);
	}
	

}
