package com.example.demo.service;

import com.example.demo.pojo.Demo;

import java.util.List;

public interface DemoService {
    List<Demo> getAllDemo();

    Demo getDemoById(Long id);

    void createDemo(Demo demo);

    void updateDemo(Demo demo, Long id);

    void deleteDemo(Long id);
}
