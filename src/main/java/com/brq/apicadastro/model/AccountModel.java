package com.brq.apicadastro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class AccountModel {


    private Integer ID;

    private UUID GuidID;

    private Long agency;

    private String accountType;

    private UserModel userID;

}
