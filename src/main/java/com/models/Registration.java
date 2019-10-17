package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Registration {

    @Id
    private long Id;

    @JsonProperty
    public String email;

    @JsonProperty
    public String password;

    @JsonProperty
    public String companyName;

    @JsonProperty
    public  String country;

    @JsonProperty
    public String timeZone;

    @JsonProperty
    public  String currency;

    @JsonProperty
    public String firstName;

    @JsonProperty
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
}









