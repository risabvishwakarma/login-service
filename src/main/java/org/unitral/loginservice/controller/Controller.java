package org.unitral.loginservice.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.unitral.loginservice.entity.UserRegisterData;


@RestController
public class Controller {
    Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private org.unitral.loginservice.service.Service service;

    @PostMapping("/save")
    public UserRegisterData login(@RequestBody UserRegisterData userRegisterData) {

        logger.info("User registered with email: {}", userRegisterData.getEmail());

        UserRegisterData newUserRegisterData = service.generateUsername(userRegisterData);

        return userRegisterData;
    }

}





