package com.example.demo.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice{
    private final Map<Integer, Studententity>store=new HashMap<>();
    private int counter =1;

    @Override
    public Studententity saveData(Studententity st){
        st.setId(counter++);
        store.put(st.getId(),st);
        return st;
    }

    @Override
    public List<Studententity>getAllStudent(){
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Studententity>getStudent(Long id){
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Stu

}