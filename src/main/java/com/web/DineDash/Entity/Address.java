package com.web.DineDash.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //One User can have multiple address
    @ManyToOne
    private AppUser user;

}
