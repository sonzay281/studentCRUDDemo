/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ismt.studentapp.services;

import com.ismt.studentapp.dao.StudentDAO;
import com.ismt.studentapp.dao.impl.StudentDAOImpl;
import com.ismt.studentapp.entities.Student;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author nepz
 */
public abstract class AddStudent {

    public static void addStudent() {
        Student s = new Student();
        StudentDAO studentDao = new StudentDAOImpl();
        Scanner sc = new Scanner(System.in);

        String str;
        int no;
        System.out.print("First Name:");
        str = sc.next();
        s.setFirstName(str);

        System.out.print("Last Name:");
        str = sc.next();
        s.setLastName(str);

        System.out.print("Roll Number:");
        no = sc.nextInt();
        s.setRollNo(no);

        System.out.print("Section:");
        str = sc.next();
        s.setSection(str);

        System.out.print("Phone:");
        str = sc.next();
        s.setPhone(str);

        System.out.print("Address:");
        str = sc.next();
        s.setAddress(str);

//                System.out.print("DOB:");
//                s.set(sc.nextLine());
        try {
            if (studentDao.add(s) > 0) {
                System.out.println("Data Saved.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
