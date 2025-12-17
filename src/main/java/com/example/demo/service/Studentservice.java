package com.example.demo.service;

import java.util.*;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Studententity;

@Service
public class Studentservice{

    private Map<Integer, Studententity>details=new HashMap<>();

    public Studententity saveData(Studententity st){
        details.put(st.getId(),st);
        return st;
    }

    public Studententity getStudents(int id){
        return details.get(id);
    }

    public List<Studententity> getAllStudents(){
        return details.values().stream().Collect(Collectors.toList());
    }

    public Studententity updateStudent(int id, Studententity st){
        Studententity existing=details.get(id);
        if( existing !=null){
            existing.setName(st.getName());
            existing.setEmail(st.getEmail());
        }
        return existing;
    }
}