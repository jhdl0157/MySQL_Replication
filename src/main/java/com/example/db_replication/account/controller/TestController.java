package com.example.db_replication.account.controller;


import com.example.db_replication.account.dto.AccountRequest;
import com.example.db_replication.account.entity.Account;
import com.example.db_replication.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private  final AccountService accountService;
    @GetMapping("/read-only")
    public List<Account> getAccount(){
        return accountService.getAccountList();
    }
    @PostMapping("/post")
    public Account postAccount( @RequestPart(value = "account") AccountRequest accountRequest){
        return accountService.createAccount(accountRequest);
    }

}
