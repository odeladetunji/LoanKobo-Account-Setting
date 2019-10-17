package com.services;

import com.dao.RegistrationRepository;
import com.dao.UserRepository;
import com.entity.Biodata;
import com.entity.User;
import com.loanfactory.AbstractFactory;
import com.loanfactory.FactoryProducer;
import com.models.Registration;
import com.models.SignupDetials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndPoints implements RegistrationServiceInterface {

    @Autowired
    public RegistrationRepository registrationRep;

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean checkIfUserExit(SignupDetials bodyPayload){
        Iterable<Biodata> result = registrationRep.findDistinctByEmail(bodyPayload.email);
        List<Biodata> obj = (List<Biodata>) result;

        boolean dResult = false;
        switch (obj.size()){
            case 1:
                dResult = true;
                break;
            case 0:
                dResult = false;
        }

        return dResult;
    }

    @Override
    public void signupUser(SignupDetials bodyPayload){
        AbstractFactory entityFactory = FactoryProducer.getFactory();
        User aUser = entityFactory.getUser();
        aUser.email = bodyPayload.email;
        aUser.password = bodyPayload.password;
        userRepository.save(aUser);
    }

    @Override
    public boolean onBoardingUser(Registration onboardingUser){
        Iterable<Biodata> user = registrationRep.findDistinctById(onboardingUser.getId());
        if (((List<Biodata>) user).isEmpty()) return false;

        AbstractFactory entityFactory = FactoryProducer.getFactory();
        Biodata biodata = entityFactory.getBiodata();

        biodata.id = onboardingUser.getId();
        biodata.email = onboardingUser.getEmail();
        biodata.password = onboardingUser.getPassword();
        biodata.companyName = onboardingUser.getCompanyName();
        biodata.country = onboardingUser.getCountry();
        biodata.currency = onboardingUser.getCurrency();
        biodata.firstName = onboardingUser.getFirstName();
        biodata.lastName = onboardingUser.getLastName();
        biodata.timeZone = onboardingUser.getTimeZone();

        try {
            registrationRep.save(biodata);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
}


























