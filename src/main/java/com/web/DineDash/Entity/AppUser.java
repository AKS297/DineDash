package com.web.DineDash.Entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "User")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "userName",nullable = false)
    private String userName;

    @Column(name = "password",nullable = false)
    private String passWord;

    @Column(name = "email",nullable = false)
    private String eMail;

    //Many ordrs can be placed by single user
    @OneToMany(mappedBy = "appUser")
    private List<Order> userOrders = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Address> adress = new ArrayList<>();


}
