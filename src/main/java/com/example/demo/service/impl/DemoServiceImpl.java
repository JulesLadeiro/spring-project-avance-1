package com.example.demo.service.impl;

import com.example.demo.pojo.Demo;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    public static List<Demo> listDemo = new ArrayList<>();

    @Override
    public List<Demo> getAllDemo() {
        return listDemo;
    }

    @Override
    public Demo getDemoByLibelle(String libelle) {
        return listDemo.stream()
                .filter(demo -> demo.getLibelle()
                        .equals(libelle))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void createDemo(Demo demo) {
        listDemo.add(demo);
    }

    @Override
    public void updateDemo(Demo demo, String libelle) {
        Demo maDemo = getDemoByLibelle(libelle);
        maDemo.setPoid(demo.getPoid());
        listDemo.removeIf(demoItem -> demoItem.getLibelle()
                .equals(maDemo.getLibelle()));
        listDemo.add(maDemo);
    }

    @Override
    public void deleteDemo(String libelle) {
        listDemo.removeIf(demoItem -> demoItem.getLibelle()
                .equals(libelle));
    }
}
