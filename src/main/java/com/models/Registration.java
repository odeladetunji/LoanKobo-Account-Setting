package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Registration {

    @JsonProperty("Id")
    private long Id;

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

    public Registration(String email, String password, String companyName, String country, String timeZone,
                        String currency, String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.country = country;
        this.companyName = companyName;
        this.timeZone = timeZone;
        this.currency = currency;
    }

    private Registration(){}
}









