package com.example.db_replication.account.service;

import com.example.db_replication.account.dto.AccountRequest;
import com.example.db_replication.account.entity.Account;
import com.example.db_replication.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class AccountService {
    private final AccountRepository accountRepository;
    private final DataSource dataSource;

    @Transactional(readOnly = true)
    public List<Account> getAccountList(){
        return accountRepository.findAll();
    }


    public Account createAccount(AccountRequest accountRequest) {
        Account newAccount=accountRepository.save(accountRequest.toAccount(accountRequest));
        return newAccount;
    }
}
