package com.FivePoints.Test.Service;

import java.util.List;

import com.FivePoints.Test.Entities.Vote; 

public interface ServiceVote {

	public void AddVote (Vote vote);
	public List<Vote> find();
	public Vote getById(int id);
	public void update(Vote v);
	
}
