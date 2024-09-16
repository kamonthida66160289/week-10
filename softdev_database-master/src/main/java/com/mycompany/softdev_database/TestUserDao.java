/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softdev_database;

import com.mycompany.softdev_database.dao.UserDao;
import com.mycompany.softdev_database.helper.DatabaseHelper;
import com.mycompany.softdev_database.model.User;

/**
 *
 * @author informatics
 */
public class TestUserDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        for(User u: userDao.getAll()){
            System.out.println(u);
     
        }
        User user1 = userDao.get(2);
        System.out.println(user1);
        DatabaseHelper.close();
        
    }
    
}
