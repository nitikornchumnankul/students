package com.students.students.members.services;

import com.students.students.members.entity.Schools;
import com.students.students.members.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    private SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository){
        this.schoolRepository = schoolRepository;
    }
  public List<Schools> getSchools(){
        return this.schoolRepository.findAll();
  }


  public void addSchools(Schools schools){
        schoolRepository.save(schools);
  }

  public Optional<Schools> findSchoolsbyId(long id){
        return schoolRepository.findSchoolsById(id);
  }

  public Optional<Schools> updateSchoolsbyId(Schools schools){
        Optional<Schools> optionalSchools = schoolRepository.findSchoolsById(schools.getId());
        Schools exittingSchools = optionalSchools.get();
        exittingSchools.setExam(schools.getExam());
        exittingSchools.setName(schools.getName());

        return  optionalSchools;
  }
}
