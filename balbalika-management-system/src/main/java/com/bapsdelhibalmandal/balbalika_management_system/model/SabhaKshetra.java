package com.bapsdelhibalmandal.balbalika_management_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SabhaKshetra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer kshetraId;
    private String kshtra;

    @OneToOne(mappedBy = "sabhaKshetra")
    private Kid kid;
}
