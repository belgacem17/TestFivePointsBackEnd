package com.FivePoints.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.FivePoints.Test.Entities.Sujet;
import com.FivePoints.Test.Entities.Utilisateur;
import com.FivePoints.Test.Service.ServiceSujet;
import com.FivePoints.Test.Service.ServiceUser;
import com.FivePoints.Test.Service.ServiceVote;

@RestController
@RequestMapping("sujet")
public class ControlerSujet {

	@Autowired
	ServiceSujet serviceSujet;
	
	@Autowired
	ServiceVote serviceVote;
	
	@Autowired
	ServiceUser serviceUser;
	
	@RequestMapping("/add/{idUtil}/{etatVote}")
	public void  addSujet(@PathVariable("idUtil") int id, @RequestBody Sujet sujet,@PathVariable("etatVote") boolean etat) {
		Utilisateur util= serviceUser.getById(id);
		sujet.setUtilisateur(util);
		serviceSujet.AddSujet(sujet);
//		Vote vote = new Vote();
//		vote.setSujet(sujet);
//		vote.setUtilisateur(util);
//		serviceVote.AddVote(vote);
	}
	
	@RequestMapping("/findAll")
	public List<Sujet> findAll(){
		return serviceSujet.find();
	}
	
	@RequestMapping("/findbyId/{id}")
	public Sujet getById (@PathVariable("id") int id){
	
		return serviceSujet.getById(id);
	}
	
	@RequestMapping("/findbyId/{idUtil}")

	public void update(@RequestBody Sujet sujet,@PathVariable("idUtil") int id) {
		Utilisateur utl= serviceUser.getById(id);
		sujet.setUtilisateur(utl);
		serviceSujet.AddSujet(sujet);
		
	} 
}
