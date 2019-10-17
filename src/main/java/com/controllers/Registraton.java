package com.controllers;

import com.models.LoginDetails;
import com.models.SignupDetials;
import com.services.RegistrationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Registraton {

    @Autowired
    RegistrationServiceInterface endPoints;

    @ResponseBody
    @PostMapping(value = "/signupUser")
    public String signupUser(@RequestBody SignupDetials bodyObjects){
        boolean regStatus =  endPoints.checkIfUserExit(bodyObjects);
           if (regStatus == true)  return  "user already exist";
           endPoints.signupUser(bodyObjects);
           return "Registration Successfull";
    }

    @ResponseBody
    @PostMapping(value = "/loginUser")
    public boolean loginUser(@RequestBody LoginDetails loginDetails){
        return true;
    }
}


































