package com.loanfactory;


import com.entity.Biodata;
import com.entity.User;

public abstract class AbstractFactory {
    public abstract Biodata getBiodata();
    public abstract User getUser();
}
