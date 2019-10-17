package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SignupDetials {

    @JsonProperty
    public String email;
    @JsonProperty
    public String password;

}
