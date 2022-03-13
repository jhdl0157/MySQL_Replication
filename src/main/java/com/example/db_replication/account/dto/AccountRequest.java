package com.example.db_replication.account.dto;


import com.example.db_replication.account.entity.Account;
import lombok.Data;

@Data
public class AccountRequest {
    String accountEmail;
    String profileNickname;
    String userName;

    public  Account toAccount(AccountRequest accountRequest){
        Account account=new Account();
        account.setAccountEmail(accountRequest.getAccountEmail());
        account.setProfileNickname(accountRequest.getProfileNickname());
        account.setUserName(accountRequest.getUserName());
        return account;
    }
}
