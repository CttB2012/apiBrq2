package com.brq.apicadastro.model.database;

import com.brq.apicadastro.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity()
@Table (name = "Account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountModelDataBase {

    @Id
    @Column (name = "account_id", nullable = false, length = 36)
    private String GuidID;

    @Column(name = "banck_code")
    private Long bankCode;

    @Column (name = "agency", nullable = false, length = 4)
    private Long agency;

    @Column (name = "account_type", nullable = false, length = 4)
    private String accountType;

    @ManyToOne
    @JoinColumn (name = "id_usuario")
    private UserModelDataBase userId;

}
