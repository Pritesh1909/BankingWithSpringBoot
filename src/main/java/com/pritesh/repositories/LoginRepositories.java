package com.pritesh.repositories;

import com.pritesh.dao.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepositories extends JpaRepository<UserCredentials,String> {

}
