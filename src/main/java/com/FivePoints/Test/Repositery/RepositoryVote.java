package com.FivePoints.Test.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.Test.Entities.Vote;

@Repository("RepositoryVote")
public interface RepositoryVote extends JpaRepository<Vote, Integer>{

}
