package com.sid.ebankingbackend.repositories;

import com.sid.ebankingbackend.entities.BankAccount;
import com.sid.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
