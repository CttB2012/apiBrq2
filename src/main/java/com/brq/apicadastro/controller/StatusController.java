package com.brq.apicadastro.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class StatusController {


        @GetMapping(path = "/api/statusAPI")
        public String check() {
            return "Online";

        }
}
