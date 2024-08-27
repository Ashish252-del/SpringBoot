package com.springBoot.leanrSpringBoot.courses.controller;

import com.springBoot.leanrSpringBoot.courses.bean.Course;
import com.springBoot.leanrSpringBoot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourceControler {
//    @GetMapping("/courses")
//    public List<Course> getAllCourses() {
//        return Arrays.asList(new Course("Janv--Cource" , 1500 , 1));
//    }
@Autowired
private CourseRepository repository;

    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    //// http://localhost:8080/courses/1
    @GetMapping("/courses/{id}")
    public Course getCourseDetails(@PathVariable long id) {
      // optional is used because it is returning optional there may be a course or may not as well
        Optional<Course> course = repository.findById(id);

        if(course.isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        }

        return course.get(); // it gives value if present
    }

	/*
	POST http://localhost:8080/courses
	{
		  "name": "Learn DevOps",
		  "author": "in28minutes"
	}*/

    //POST - Create a new resource (/courses)
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repository.save(course);
    }

	/*
	PUT - http://localhost:8080/courses/100001
	{
		 "id": 100001,
		 "name": "Learn Microservices 2",
		 "author": "in28minutes"
		}
	*/

    //PUT - Update/Replace a resource (/courses/1)
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course){
        repository.save(course);
    }


    //DELETE - Delete a resource (/courses/1)
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }
}

//	docker run --detach
//	--env MYSQL_ROOT_PASSWORD=dummypassword
//	--env MYSQL_USER=courses-user
//	--env MYSQL_PASSWORD=dummycourses
//	--env MYSQL_DATABASE=courses
//	--name mysql
//	--publish 3306:3306 mysql:5.7
