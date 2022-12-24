package com.students.students.members.services;

import com.students.students.members.entity.Schools;
import com.students.students.members.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchoolService {
    private SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository){
        this.schoolRepository = schoolRepository;
    }
  public List<Schools> getSchools(){
        return this.schoolRepository.findAll();
  }
}
