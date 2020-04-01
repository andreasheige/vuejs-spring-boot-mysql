package com.taskagile.domain.application;

import com.taskagile.domain.application.commands.RegistrationCommand;
import com.taskagile.domain.model.user.RegistrationException;


public interface UserService {

    /**
     * 
     * Register a new user with username, emailaddress and passweord
     * 
     * 
     * @param command instance of <code>RegistrationCommand</code>
     * @throws RegistrationException when registration failed. Possible reasons are:
     *                                 1. Username already exists
     *                                 2. Email already exists         
     */
    
    void register(RegistrationCommand command) throws RegistrationException;  
}