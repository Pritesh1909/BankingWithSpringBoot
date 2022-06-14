package com.pritesh.repositories;

import com.pritesh.model.AccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositories extends CrudRepository<AccountDao,Integer> {
}
