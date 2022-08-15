package com.brq.apicadastro.service;

import com.brq.apicadastro.repository.AccountRepository;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

    @Service
    @NoArgsConstructor

    public class AccountService {
    private AccountRepository accountRepository;


    public void AccountRepository(AccountRepository accountService) {
        
        this.accountRepository = accountRepository;
    }
}




