package com.ismt.studentapp.dao;

import com.ismt.studentapp.entities.Student;
import java.sql.SQLException;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nepz
 */
public interface StudentDAO {

    int add(Student s) throws SQLException, ClassNotFoundException;

    int update(Student s) throws SQLException, ClassNotFoundException;

    int delete(int id) throws SQLException, ClassNotFoundException;

    List<Student> getAll() throws SQLException, ClassNotFoundException;

    Student getById(int id) throws SQLException, ClassNotFoundException;
}
