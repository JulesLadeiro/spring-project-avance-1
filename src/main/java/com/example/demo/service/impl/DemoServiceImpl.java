package com.example.demo.service.impl;

import com.example.demo.pojo.Demo;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;

    @Override
    public List<Demo> getAllDemo() {
        return demoRepository.findAll();
    }

    @Override
    public Demo getDemoById(Long id) {
        return demoRepository.findById(id).orElse(null);
    }

    @Override
    public void createDemo(Demo demo) {
        demoRepository.save(demo);
    }

    @Override
    public void updateDemo(Demo demo, Long id) {
        Demo maDemo = this.getDemoById(id);
        maDemo.setPoid(demo.getPoid());
        maDemo.setLibelle(demo.getLibelle());
        demoRepository.save(maDemo);
    }

    @Override
    public void deleteDemo(Long id) {
        demoRepository.deleteById(id);
    }
}
