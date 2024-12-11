package com.revature.itemManageApp.repository;

import com.revature.itemManageApp.entities.Account;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepositoryImplementation<Account,Integer> {
}