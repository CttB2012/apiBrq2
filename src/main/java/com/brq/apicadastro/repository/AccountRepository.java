package com.brq.apicadastro.repository;


import com.brq.apicadastro.model.AccountModel;
import com.brq.apicadastro.model.database.AccountModelDataBase;
import org.springframework.data.repository.CrudRepository;



    public interface AccountRepository extends CrudRepository<AccountModelDataBase, Integer> {


    }