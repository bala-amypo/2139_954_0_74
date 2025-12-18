package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;


@RestController
public class Studentcontroller {

    @Autowired
    Studentservice ser;

    @PostMapping("/Postadd")
    public Studententity save(@RequestBody Studententity st) {
        return ser.saveData(st);
    }

    @GetMapping("/Getadd/{id}")
    public Studententity getStudents(@PathVariable int id) {
        return ser.getStudents(id);
    }

    @GetMapping("/GetAll")
    public List<Studententity> getAllStudent() {
        return ser.getAllStudents();
    }

    @PutMapping("/Update/{id}")
    public Studententity updateStudent(@PathVariable int id,
                                       @RequestBody Studententity st) {
        return ser.updateStudent(id, st);
    }
}
