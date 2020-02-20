package com.example.jpa_demo1.domain;

import org.hibernate.annotations.GenericGenerator;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.persistence.*;

@Table(name = "t_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(length = 255)
    private String phoneNumber;
    private String password;
    private String imgUrl;
}
