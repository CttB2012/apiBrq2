package com.brq.apicadastro.model;


import com.brq.apicadastro.model.AccountModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserModel {


    @JsonProperty("id_usuario")
    private String userId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("birthDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("id_conta")
    private String account;

}
