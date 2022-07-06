package com.springapi.courses.controller;

import com.springapi.courses.entity.CourseEntity;
import com.springapi.courses.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("/home")
    public String Home() {
        return "Hello World";
    }

    @GetMapping("/courses")
    public List<CourseEntity> getCourses() {
        return service.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public CourseEntity getCourse(@PathVariable String courseId) {
        return service.getCourse(Integer.parseInt(courseId));
    }

    @PostMapping(path = "/courses", consumes = "application/json")
    public CourseEntity addCourse(@RequestBody CourseEntity course) {
        return service.addCourse(course);
    }

    @PutMapping(path = "/courses", consumes = "application/json")
    public CourseEntity updateCourse(@RequestBody CourseEntity course) {
        return service.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            service.deleteCourse(Integer.parseInt(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
