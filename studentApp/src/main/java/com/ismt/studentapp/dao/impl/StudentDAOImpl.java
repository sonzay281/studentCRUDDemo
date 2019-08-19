package com.ismt.studentapp.dao.impl;

import com.ismt.studentapp.dao.StudentDAO;
import com.ismt.studentapp.dbutils.DBConnection;
import com.ismt.studentapp.entities.Student;
import java.sql.PreparedStatement;
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
public class StudentDAOImpl implements StudentDAO {

    DBConnection db = new DBConnection();

    @Override
    public int add(Student s) throws SQLException, ClassNotFoundException {
        String sql = "insert into tbl_students(firstName,lastName,section,phone,address,rollNo) values(?,?,?,?,?,?)";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, s.getFirstName());
        stmt.setString(2, s.getLastName());
        stmt.setString(3, s.getSection());
        stmt.setString(4, s.getPhone());
        stmt.setString(5, s.getAddress());
        stmt.setInt(6, s.getRollNo());
        int result = db.update();
        return result >= 0 ? result : 0;
    }

    @Override
    public int update(Student s) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
