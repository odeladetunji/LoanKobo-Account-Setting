package com.loanfactory;

import com.entity.Biodata;
import com.entity.User;

public class EntityFactory extends AbstractFactory {
    @Override
    public Biodata getBiodata(){
        return new Biodata();
    }

    @Override
    public User getUser(){
        return new User();
    }
}

