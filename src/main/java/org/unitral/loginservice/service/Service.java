package org.unitral.loginservice.service;

import org.unitral.loginservice.entity.UserRegisterData;


public interface Service {
    UserRegisterData generateUsername( UserRegisterData userRegisterData);
}
