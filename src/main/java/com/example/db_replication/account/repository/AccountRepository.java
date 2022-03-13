package com.example.db_replication.account.repository;

import com.example.db_replication.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  AccountRepository extends JpaRepository<Account,Long> {
}
