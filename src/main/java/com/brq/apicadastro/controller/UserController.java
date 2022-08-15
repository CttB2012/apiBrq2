package com.brq.apicadastro.controller;


import com.brq.apicadastro.model.UserModel;
import com.brq.apicadastro.model.database.UserModelDataBase;
import com.brq.apicadastro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

//    @GetMapping (path = "api/user/{code}")
//    private ResponseEntity read (@PathVariable ("code") Integer code) {
//        return userService.findById(code)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
//
//    }

    @PostMapping(path = "/api/user/create")
    private UserModel create(@RequestBody UserModel user) {
        return userService.create(user);


    }

    @DeleteMapping(path = "/api/user/delete/{id_usuario}")
    @ResponseStatus(code = HttpStatus.OK)
    private void delete(@PathVariable(value = "id_usuario", required = true) String userId) {
        userService.delete(userId);
    }


    @GetMapping(path= "/api/users")
    private List<UserModelDataBase> getAll() {
        return userService.findAll();
    }

    @GetMapping (path = "/api/user/getById/{id_usuario}")
    private UserModelDataBase findByID(@PathVariable(value = "id_usuario", required = true) String userId) {
        return userService.findById(userId);
    }

    @PutMapping(path = "/api/user/update/{id_usuario}")
    public UserModelDataBase updateUser(@PathVariable(value = "id_usuario", required = true) String userId,
                                        @RequestBody UserModel userData) throws Exception {
        //serão recebidos 2 parametros: ID e os dados
        return userService.updateUser(userId, userData);
    }






}
