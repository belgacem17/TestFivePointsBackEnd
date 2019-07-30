package com.FivePoints.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FivePoints.Test.Entities.Sujet;
import com.FivePoints.Test.Entities.Vote;
import com.FivePoints.Test.Service.ServiceSujet;
import com.FivePoints.Test.Service.ServiceVote;

@RestController
@RequestMapping("vote")
public class ControllerVote {
	
	@Autowired
	ServiceVote serviceVote;
	
	@Autowired
	ServiceSujet serviceSujet; 
	
	@RequestMapping(value="/add/{idSujet}",method=RequestMethod.POST)
	public void  addVote(@PathVariable("idSujet") int id, @RequestBody Vote vote) {
		Sujet sujet= serviceSujet.getById(id);
		vote.setSujet(sujet);
		vote.setSujet(sujet);
		vote.setUtilisateur(sujet.getUtilisateur());
		serviceVote.AddVote(vote);
	}
	
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Vote> findAll(){
		return serviceVote.find();
	}

}
