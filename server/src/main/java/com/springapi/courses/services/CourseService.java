package com.springapi.courses.services;

import com.springapi.courses.entity.CourseEntity;

import java.util.List;

public interface CourseService {

    public List<CourseEntity> getCourses();
    public CourseEntity getCourse(int courseId);
    public CourseEntity addCourse(CourseEntity course);
    public CourseEntity updateCourse(CourseEntity course);
    public void deleteCourse(int courseId);
}
