package com.springapi.courses.services;

import com.springapi.courses.dao.CourseRepository;
import com.springapi.courses.entity.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseEntity> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity getCourse(int courseId) {
        return courseRepository.getById(courseId);
    }

    @Override
    public CourseEntity addCourse(CourseEntity course) {
        courseRepository.save(course);
        return course;
    }

    @Override
    public CourseEntity updateCourse(CourseEntity course) {
        courseRepository.save(course);
        return course;
    }

    @Override
    public void deleteCourse(int courseId) {
        CourseEntity entity = courseRepository.getById(courseId);
        courseRepository.delete(entity);
    }

  /*  List<CourseEntity> list;
    public CourseServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new CourseEntity("Java","This is Basic JAVA Course."));
        list.add(new CourseEntity("C++","This is Basic C++ Course."));
        list.add(new CourseEntity(".Net","This is Basic .Net Course."));
        list.add(new CourseEntity("React","This is Basic React Course."));
    }

    @Override
    public List<CourseEntity> getCourses() {
        return list;
    }

    @Override
    public CourseEntity getCourse(int courseId) {
        CourseEntity resultCourse = null;
        for (CourseEntity course:list)
        {
         if(course.getId() == courseId)  {
             resultCourse = course;
            break;
         }
        }
        return resultCourse;
    }

    @Override
    public CourseEntity addCourse(CourseEntity course) {
        list.add(course);
        return course;
    }

    @Override
    public CourseEntity updateCourse(CourseEntity course) {
        list.forEach(e -> {
            if(e.getId() == course.getId()){
                e.setName(course.getName()) ;
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(int courseId)
    {
       // list = list.stream().filter(e-> e.getId() != courseId).collect(Collectors.toList());
    }

    */
}
