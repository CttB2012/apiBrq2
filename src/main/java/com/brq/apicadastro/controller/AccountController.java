package com.brq.apicadastro.controller;


import org.springframework.web.bind.annotation.*;

@RestController
    public class AccountController {

//    @Autowired
//    private AccountRepository accountRepository;
//
//    @GetMapping(path = "api/account/{code}")
//    private ResponseEntity getAccount(@PathVariable("code") Integer code) {
//        var response = accountRepository.findById(code)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
//
//        return ResponseEntity.ok(response);
//
//    }
//
//    @PostMapping(path = "/api/account/create")
//    public AccountModel create(@RequestBody @Valid AccountModel account) {
//        var rr = accountRepository.save(account);
//        return rr;
//    }
}
