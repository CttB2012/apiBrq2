package com.brq.apicadastro.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

        @Entity(name = "usuario")
        public class UserModel {

            public Integer ID;

            @Id
            public String GuidID;

            @Column( nullable = false, length = 25)
            public String firstName;

            @Column( nullable = false, length = 250)
            public String lastName;

            @Column( nullable = false, length = 150)
            public String email;


            public Date birthDate;

            @Column( nullable = false, length = 14)
            public String phoneNumber;


            public List account;

            public Integer getID() {
                return ID;
            }

            public void setID(Integer ID) {
                this.ID = ID;
            }

            public String getGuidID() {
                return GuidID;
            }

            public void setGuidID(String guidID) {
                GuidID = guidID;
            }

            public String getName() {
                return firstName;
            }

            public void setName(String name) {
                this.firstName = name;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public Date getBirthDate() {
                return birthDate;
            }

            public void setBirthDate(Date birthDate) {
                this.birthDate = birthDate;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public List getAccount() {
                return account;
            }

            public void setAccount(List account) {
                this.account = account;
            }
        }
