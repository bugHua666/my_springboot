package com.lee.my_springboot.domain;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @Column(name = "t_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tId;

    @Column(name = "t_name")
    private String tName;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
