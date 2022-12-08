package com.example.demo.repository;

import com.example.demo.pojo.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface DemoRepository extends JpaRepository<Demo,Long> {

    // SELECT * FROM DEMO WHERE Libelle=libelle
    List<Demo> findByLibelle(String libelle);



}

