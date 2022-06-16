package com.gather_students.homwork.controller;

import com.gather_students.homwork.model.Student;
import com.gather_students.homwork.reponsitories.StudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(path = "find")
// http:localhost:8083/find
public class FindController{
    @Autowired
    StudentReponsitory studentReponsitory;
    @RequestMapping(value = "/showListStudent", method = RequestMethod.GET)
    // http:localhost:8083/find/showListStudent
    public String showListStudent(ModelMap modelMap){
      Iterable<Student> students = studentReponsitory.findAll();
      modelMap.addAttribute("student",students);
        return "search";
    }
}
