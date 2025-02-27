/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.softdev_database.dao;

import java.util.List;
/**
 *
 * @author informatics
 */
public interface Dao<T> {
    T get(int id);
    List<T> getAll();
    T save(T obj);
    T update(T obj);
    int delete(T obj);
    
}
