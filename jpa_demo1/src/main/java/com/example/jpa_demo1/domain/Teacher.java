package com.example.jpa_demo1.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "t_teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(name = "phone_number",length = 40,unique = true)
    private String phoneNumber;
    @Column(name="password",length = 40)
    private String password;
    @Column(name = "img_url",length = 255)
    private String imgUrl;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name ="update_time")
    private Date updateTime;
}
