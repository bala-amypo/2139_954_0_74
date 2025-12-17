package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



@RestController
public class Studentcontroller{

    @Autowired
    Studentserivces ser;

    @PostMapping("/Postadd")
    public Studententity save(@RequestBody Studententity st){
        return ser.saveData(st);
    }

    @GetMapping("Getadd/{id}")
    public Studententity getStudents(@PathVariable int id){
        return ser.getStudents(id);
    }

    @GetMapping("/GetAll")
}
