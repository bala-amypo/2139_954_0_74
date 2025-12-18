package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Studententity;
import com.example.demo.repository.StudentRepo;

@Service
public class Studentserviceimpl implements Studentservice {

    private final StudentRepo repo;

    public Studentserviceimpl(StudentRepo repo) {
        this.repo = repo;
    }

    @Override
    public Studententity saveData(Studententity st) {
        return repo.save(st);
    }

    @Override
    public Studententity getStudents(int id) {
        return repo.findById((long) id).orElse(null);
    }

    @Override
    public List<Studententity> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Studententity updateStudent(int id, Studententity st) {
        return repo.findById((long) id).map(existing -> {
            existing.setName(st.getName());
            existing.setEmail(st.getEmail());
            return repo.save(existing);
        }).orElse(null);
    }
}
