package com.brq.apicadastro.repository;

import com.brq.apicadastro.model.database.UserModelDataBase;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



    public interface UserRepository extends CrudRepository<UserModelDataBase, String> {

        @Modifying
        @Query("delete UserModelDataBase where user_id = :userId")
        void deleteByUserId(String userId);
        }




