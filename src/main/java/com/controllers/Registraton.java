package com.controllers;

import com.models.LoginDetails;
import com.models.Registration;
import com.models.SignupDetials;
import com.services.RegistrationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class Registraton {

    @Autowired
    RegistrationServiceInterface endPoints;

    @ResponseBody
    @GetMapping(value = "/")
    public String ping(){
        return "Ping Successfull";
    }

    @ResponseBody
    @PostMapping(value = "/signupUser")
    public String signupUser(@RequestBody SignupDetials bodyObjects){
        boolean regStatus =  endPoints.checkIfUserExit(bodyObjects);
           if (regStatus == true)  return  "user already exist";
           endPoints.signupUser(bodyObjects);
           return "Registration Successfull";
    }

    @ResponseBody
    @PostMapping(value = "/onboarding-user")
    public String onBoardingUser(@RequestBody Registration onboardingDetails){
        boolean onboadingStatus = endPoints.onBoardingUser(onboardingDetails);
        if (onboadingStatus == true) return "Successfull!";
        if (onboadingStatus != true) return "unsuccessfull!";
        return "Something Went wrong";
    }

    @ResponseBody
    @PostMapping(value = "/loginUser")
    public boolean loginUser(@RequestBody LoginDetails loginDetails){
        return true;
    }
}


































