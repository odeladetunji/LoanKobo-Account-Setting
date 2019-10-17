package com.services;

import com.dao.RegistrationRepository;
import com.dao.UserRepository;
import com.entity.Biodata;
import com.entity.User;
import com.loanfactory.AbstractFactory;
import com.loanfactory.FactoryProducer;
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
//        return true;
    }

    @Override
    public void signupUser(SignupDetials bodyPayload){
        AbstractFactory entityFactory = FactoryProducer.getFactory();
        User aUser = entityFactory.getUser();
        aUser.email = bodyPayload.email;
        aUser.password = bodyPayload.password;
        userRepository.save(aUser);

    }
}


























