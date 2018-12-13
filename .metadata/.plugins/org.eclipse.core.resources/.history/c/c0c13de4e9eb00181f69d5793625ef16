package com.prashant.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashant.entity.Person;
 
@Repository
public interface PersonDAO extends JpaRepository<Person, Long> {
 
    public List<Person> findByFullNameLike(String name);
 
    public List<Person> findByDateOfBirthGreaterThan(Date date);
 
}