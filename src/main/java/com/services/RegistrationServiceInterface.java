package com.services;

import com.models.Registration;
import com.models.SignupDetials;

public interface RegistrationServiceInterface {
     boolean checkIfUserExit(SignupDetials bodyPayload);
     void signupUser(SignupDetials bodyPayload);
     boolean onBoardingUser(Registration onboardingUser);
}

















