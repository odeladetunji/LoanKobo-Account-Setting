package com.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Biodata {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @JsonProperty("Email")
    public String email;

    @JsonProperty("Password")
    public String password;

    @JsonProperty("CompanyName")
    public String companyName;

    @JsonProperty("Country")
    public  String country;

    @JsonProperty("TimeZone")
    public String timeZone;

    @JsonProperty("Currency")
    public  String currency;

    @JsonProperty("FirstName")
    public String firstName;

    @JsonProperty("LastName")
    public String lastName;

    public Biodata(){}

}
