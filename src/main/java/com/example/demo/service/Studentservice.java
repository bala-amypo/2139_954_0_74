package com.example.demo.service;

import java.util.*;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Studententity;

@Service
public class Studentservice{

    private Map<Integer, Studententity>details=new HashMap<>();
    private int counter=1; 

    public Studententity saveData(Studententity st){
        st.setId(counter++);
        details.put(st.getId(),st);
        return st;
    }

    public Studententity getStudents(int id){
        return details.get(id);
    }

    public List<Studententity> getAllStudents(){
        return details.values().stream().collect(Collectors.toList());
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