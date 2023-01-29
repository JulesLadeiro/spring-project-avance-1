package com.example.demo.ws;

import com.example.demo.pojo.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Demo getDemoByLibelle(@PathVariable("id") Long id){
        return demoService.getDemoById(id);
    }

    @PostMapping
    public void createDemo(@RequestBody Demo demo){
        demoService.createDemo(demo);
    }

    @PutMapping("/{id}")
    public void updateDemo(@RequestBody Demo demo,
                           @PathVariable("id") Long id){
        demoService.updateDemo(demo,id);

    }

    @DeleteMapping("/{id}")
    public void deleteDemo(@PathVariable("id") Long id){
        demoService.deleteDemo(id);
    }
}
