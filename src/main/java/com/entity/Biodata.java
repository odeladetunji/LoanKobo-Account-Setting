package com.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Biodata {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long Id;

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

    public Biodata(){}

}
