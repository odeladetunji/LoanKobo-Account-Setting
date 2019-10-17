package com.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public long id;
    @JsonProperty
    public String email;
    @JsonProperty
    public String password;
}



















