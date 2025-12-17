package com.example.demo.service;

import java.util.*;
import java.util.stream.Collectors;
import org.springframework.stereotype.serivce;
import com.example.demo.entity.Studententity;

@Serivce
public class Studentserivces{

    private Map<Integer, Studententity>details=new HashMap<>();

    public Studententity saveData(Studententity st){
        details.put(st.getId(),st);
        return st;
    }

    public Studententity getStudents(int id){
        return details.get(id);
    }

    public List<Studententity> getStudents(){
        return details.values().stream().coll
    }
}