package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



@RestController
public class Studentcontroller{

    @Autowired
    Studentserivces ser;
    @PostMapping("/Postadd")

    public Studententity save(@Req)
}
