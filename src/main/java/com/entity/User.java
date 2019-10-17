package com.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class User {
    @JsonProperty
    public String email;
    @JsonProperty
    public String password;
}



















