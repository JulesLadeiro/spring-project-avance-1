package com.example.demo.ws;

import com.example.demo.pojo.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = ApiRegistration.DEMO_WS)
public class DemoWs {

    @Autowired
    private DemoService demoService;

    @GetMapping
    public List<Demo> getAllDemo(){
        return demoService.getAllDemo();
    }

    @GetMapping("/{libelle}")
    public Demo getDemoByLibelle(@PathVariable("libelle") String libelle){
        return demoService.getDemoByLibelle(libelle);
    }

    @PostMapping
    public void createDemo(@RequestBody Demo demo){
        demoService.createDemo(demo);
    }

    @PutMapping("/{libelle}")
    public void updateDemo(@RequestBody Demo demo,
                           @PathVariable("libelle") String libelle){
        demoService.updateDemo(demo,libelle);

    }

    @DeleteMapping("/{libelle}")
    public void deleteDemo(@PathVariable("libelle") String libelle){
        demoService.deleteDemo(libelle);
    }
}
