package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Studententity;

public interface Studentservice {

    Studententity saveData(Studententity st);

    Studententity getStudents(int id);

    List<Studententity> getAllStudents();

    Studententity updateStudent(int id, Studententity st);
}
