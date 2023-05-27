package com.example.testdeploy.web;


import com.example.testdeploy.entiies.Client;
import com.example.testdeploy.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientControler {

    @Autowired
    private ClientRepo service;


    @GetMapping(path = "/clients")
    public List<Client> clientList(){
        return service.findAll();
    }

    @GetMapping(path = "/client")
    public Client clientList(@RequestParam(name = "id") long id){
        return service.findById(id).orElseThrow(()-> new RuntimeException("client not found "));
    }

    @PostMapping(path = "/client")
    public Client create(@RequestBody Client client){
        return service.save(client);
    }


}
