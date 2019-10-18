package com.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    public long id;

    @Column(name = "email")
    public String email;

    @Column(name = "password")
    public String password;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "biodata_id", referencedColumnName = "id", unique = true)
    public Biodata biodata;

    public User(){}

}



















