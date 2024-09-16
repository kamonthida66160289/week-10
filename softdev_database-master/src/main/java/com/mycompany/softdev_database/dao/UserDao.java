/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softdev_database.dao;

import com.mycompany.softdev_database.helper.DatabaseHelper;
import com.mycompany.softdev_database.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author informatics
 */
public class UserDao implements Dao<User> {

    @Override
    public User get(int id) {
        User user = null;
        String sql = "SELECT * FROM user WHERE user_id=?";
        Connection conn = DatabaseHelper.getConnect();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt ("user_id"));
                user.setName(rs.getString ("user_name"));
                user.setRole(rs.getInt("user_role"));
                user.setGender(rs.getString("user_gender"));
                user.setPassword(rs.getString("user_password"));
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }
    

    @Override
    public List<User> getAll() {
        ArrayList<User> list = new ArrayList();
        String sql = "SELECT * FROM user";
        Connection conn = DatabaseHelper.getConnect();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt ("user_id"));
                user.setName(rs.getString ("user_name"));
                user.setRole(rs.getInt("user_role"));
                user.setGender(rs.getString("user_gender"));
                user.setPassword(rs.getString("user_password"));
                
               list.add(user);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    @Override
    public User save(User obj) {
        String sql = "ISERT INTO user (user_name,user_gender,user_password,user_role)"
                + "VALUE(?, ?, ?, ?)";
        Connection conn = DatabaseHelper.getConnect();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt ("user_id"));
                user.setName(rs.getString ("user_name"));
                user.setRole(rs.getInt("user_role"));
                user.setGender(rs.getString("user_gender"));
                user.setPassword(rs.getString("user_password"));
                
            
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        return obj;
    }

    @Override
    public User update(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
