package com.FivePoints.Test.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FivePoints.Test.Entities.Vote;
import com.FivePoints.Test.Repositery.RepositoryVote;
import com.FivePoints.Test.Service.ServiceVote;

@Service("ImplServicesVote")
public class ImplServicesVote implements ServiceVote{

	@Autowired
	RepositoryVote repositeryVote;

	@Override
	public void AddVote(Vote vote) {
		repositeryVote.save(vote);
		
	}

	@Override
	public List<Vote> find() {
		 
		return repositeryVote.findAll();
	}

	@Override
	public Vote getById(int id) {
		 
		return repositeryVote.getOne(id);
	}

	@Override
	public void update(Vote v) {
		repositeryVote.save(v);		
	}
}
