package com.brq.apicadastro.model.database;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModelDataBase {


    @Id
    @Column( name = "userId",nullable = false, length = 36)
    private String GuidID;

    @Column( name = "firstName", nullable = false, length = 25)
    private String firstName;

    @Column( name = "lastName", nullable = false, length = 250)
    private String lastName;

    @Column( name = "email",nullable = false, length = 150)
    private String email;

    @Column( name = "birthDate", nullable = false, length = 10)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    @Column( name = "phoneNumber",nullable = false, length = 14)
    private String phoneNumber;

    @OneToMany(mappedBy ="userId" )
    private List<AccountModelDataBase> account;


}
