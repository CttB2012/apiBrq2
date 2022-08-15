package com.brq.apicadastro.service;


import com.brq.apicadastro.model.UserModel;
import com.brq.apicadastro.model.database.UserModelDataBase;
import com.brq.apicadastro.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@NoArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel create(UserModel user) {
        var userDataBase = mapToDataBase(user);
        var responseDataBase = userRepository.save(userDataBase);
        var response = mapToResponse(responseDataBase);
        return response;
    }

    private UserModel mapToResponse(UserModelDataBase user){
        UserModel u = new UserModel();
        u.setFirstName(user.getFirstName());
        u.setLastName(user.getLastName());
        u.setUserId(user.getGuidID());
        u.setEmail(user.getEmail());
        u.setAccount("");
        u.setPhoneNumber(user.getPhoneNumber());
        u.setBirthDate(user.getBirthDate());
        return u;
    }
    private UserModelDataBase mapToDataBase(UserModel user){
        UserModelDataBase u = new UserModelDataBase();
        u.setGuidID(UUID.randomUUID().toString());
        u.setFirstName(user.getFirstName());
        u.setEmail(user.getEmail());
        u.setBirthDate(user.getBirthDate());
        u.setPhoneNumber(user.getPhoneNumber());
        u.setLastName(user.getLastName());
        return u;
    }

    @Transactional
    public void delete(String userId) {
        userRepository.deleteByUserId(userId);

    }




    public List<UserModelDataBase> findAll() {
        return (List<UserModelDataBase>) userRepository.findAll();
    }

    public UserModelDataBase findById(String userId) {
        return userRepository.findById(userId).get();
    }


    public UserModelDataBase updateUser(String userId, UserModel user) throws Exception {
        try {
            var userData = userRepository.findById(userId).get();
            var userUpdated = mapToUpdateUser(userData,user);

            return userRepository.save(userUpdated);
        }catch (Exception e){
            throw new Exception("Usuario nao existente");
        }

    }
    private UserModelDataBase mapToUpdateUser(UserModelDataBase userData, UserModel user) {

        userData.setFirstName(user.getFirstName());
        userData.setLastName(user.getLastName());
        userData.setEmail(user.getEmail());
        userData.setPhoneNumber(user.getPhoneNumber());

        return userData;
    }

}



