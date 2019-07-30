package com.FivePoints.Test.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.FivePoints.Test.Entities.Utilisateur; 

@Repository("RepositeryUser")
public interface RepositeryUser extends JpaRepository<Utilisateur, Integer>{

	 @Query("select u from Utilisateur u where u.login = ?1 and u.passwd = ?2")
		public  Utilisateur login(String login, String passwd);
}
