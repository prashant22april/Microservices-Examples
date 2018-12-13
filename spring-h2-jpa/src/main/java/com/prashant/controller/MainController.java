package com.prashant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant.dao.PersonDAO;
import com.prashant.entity.Person;
 
@RestController
public class MainController {
 
    @Autowired
    private PersonDAO personDAO;
 
    @RequestMapping("/")
    public List<Person> index() {
        return personDAO.findAll();
    }
 
}