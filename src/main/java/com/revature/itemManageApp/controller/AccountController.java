package com.revature.itemManageApp.controller;

import com.revature.itemManageApp.entities.Account;
import com.revature.itemManageApp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
 AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create")
    ResponseEntity <Account> registerUser(@RequestBody Account account){
        Account result = accountService.createUser(account);
        return ResponseEntity.ok(result);
    }
}
