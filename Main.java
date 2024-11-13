package com.lms;

import com.lms.dao.CourseDAO;
import com.lms.dao.StudentDAO;
import com.lms.model.Course;
import com.lms.model.Student;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CourseDAO courseDAO = new CourseDAO();
        StudentDAO studentDAO = new StudentDAO();

        // Adding a course
        Course course = new Course(0, "Java Programming", "Learn Java from scratch", "John Doe");
        courseDAO.addCourse(course);

        // Adding a student
        Student student = new Student(0, "Alice", "alice@example.com", new Date());
        studentDAO.addStudent(student);

        // Fetch course by ID
        Course fetchedCourse = courseDAO.getCourseById(1);
        System.out.println("Fetched Course: " + fetchedCourse.getTitle());

        // Fetch student by ID
        Student fetchedStudent = studentDAO.getStudentById(1);
        System.out.println("Fetched Student: " + fetchedStudent.getName());
    }
}
