package com.lee.my_springboot.domain;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @Column(name="s_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sId;

    @Column(name="s_name")
    private String sName;

    @Column(name="s_age")
    private Integer sAge;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }
}
