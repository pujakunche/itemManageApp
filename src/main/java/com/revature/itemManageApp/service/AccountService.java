package com.revature.itemManageApp.service;

import com.revature.itemManageApp.entities.Account;
import com.revature.itemManageApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    AccountRepository accountRepository;
    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createUser(Account account){

        Account newUser = new Account();
        newUser.setEmail(account.getEmail());
        newUser.setPassword(account.getPassword());
        newUser.setRole(account.getRole());
        newUser.setUsername(account.getUsername());
        newUser.setId(account.getId());
accountRepository.save(newUser);
        return newUser;
    }
}

