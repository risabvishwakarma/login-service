package org.unitral.loginservice.service;

import org.unitral.loginservice.entity.UserRegisterData;

import java.util.logging.Logger;


@org.springframework.stereotype.Service
public class ImplService implements Service{

    Logger logger = Logger.getLogger(ImplService.class.getName());
    @Override
    public UserRegisterData generateUsername(UserRegisterData userRegisterData) {

        String username = userRegisterData.getFirstName().substring(0, 2) + userRegisterData.getLastName().substring(0, 2);
        logger.info("Generated username: " + username);
        userRegisterData.setUsername(username);

        return userRegisterData;
    }
}
