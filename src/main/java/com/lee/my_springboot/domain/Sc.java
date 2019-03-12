package com.lee.my_springboot.domain;

import javax.persistence.*;

@Entity
@Table(name = "sc")
public class Sc {
    @Id
    @Column(name = "sc_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer scId;

    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "c_id")
    private Integer cId;

    @Column(name = "score")
    private String score;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }
}
