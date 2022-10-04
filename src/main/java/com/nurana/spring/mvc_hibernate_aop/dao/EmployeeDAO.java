/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurana.spring.mvc_hibernate_aop.dao;

import com.nurana.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;

/**
 *
 * @author user
 */
public interface EmployeeDAO {
    public List <Employee> getAllEmployees();
    
    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
