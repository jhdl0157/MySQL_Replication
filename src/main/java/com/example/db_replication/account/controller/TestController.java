package com.example.db_replication.account.controller;


import com.example.db_replication.account.entity.Account;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/replication")
public class TestController {
    @GetMapping("/read-only")
    public List<Account> getAccount(){

    }
    @PostMapping
    public String postAccount( @RequestPart(value = "account")  AccountRequest accountRequest){

    }

}
