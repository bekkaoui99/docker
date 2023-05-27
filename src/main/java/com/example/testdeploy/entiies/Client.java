package com.example.testdeploy.entiies;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Client {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String adresse;
    private String mail;


}
