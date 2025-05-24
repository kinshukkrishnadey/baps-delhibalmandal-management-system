package com.bapsdelhibalmandal.balbalika_management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SabhaKshetra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer kshetraId;
    private String kshtra;
}
