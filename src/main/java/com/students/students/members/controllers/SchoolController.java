package com.students.students.members.controllers;

import com.students.students.members.entity.Schools;
import com.students.students.members.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/schools")
public class SchoolController {

    private SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @GetMapping
    public List<Schools> getShools(){
        return  this.schoolService.getSchools();
    }

    @PostMapping
    public void addSchools(@RequestBody Schools schools){
        schoolService.addSchools(schools);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Schools> findSchoolsbyId(@PathVariable long id){
        return schoolService.findSchoolsbyId(id);
    }

    @PutMapping
    @ResponseBody
    public Optional<Schools> updateSchoolsbyId(@RequestBody Schools schools){
        return schoolService.updateSchoolsbyId(schools);
    }
}
