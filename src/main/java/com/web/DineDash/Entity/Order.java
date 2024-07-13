package com.web.DineDash.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Many orders can be placed by single user
    @ManyToOne
    private AppUser appUser;

    //Considering user selects only one Address to deliver many Orders
    @ManyToOne
    private Address address;
}
