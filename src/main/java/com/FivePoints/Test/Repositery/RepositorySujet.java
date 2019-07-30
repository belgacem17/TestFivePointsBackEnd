package com.FivePoints.Test.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.Test.Entities.Sujet;

@Repository("RepositorySujet")
public interface RepositorySujet extends JpaRepository<Sujet, Integer>{

}
