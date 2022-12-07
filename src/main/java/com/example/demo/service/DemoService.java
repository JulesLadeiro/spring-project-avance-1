package com.example.demo.service;

import com.example.demo.pojo.Demo;

import java.util.List;

public interface DemoService {
    List<Demo> getAllDemo();

    Demo getDemoByLibelle(String libelle);

    void createDemo(Demo demo);

    void updateDemo(Demo demo, String libelle);

    void deleteDemo(String libelle);
}
