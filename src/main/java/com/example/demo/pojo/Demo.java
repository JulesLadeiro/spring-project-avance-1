package com.example.demo.pojo;


import javax.persistence.*;

@Entity
public class Demo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    private Integer poid;


    public Demo() {
    }

    public Demo(String libelle, Integer poid) {
        this.libelle = libelle;
        this.poid = poid;
    }

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
