/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurana.spring.mvc_hibernate_aop.service;

import com.nurana.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.nurana.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;
    
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
     @Transactional
    public void saveEmployee(Employee employee) {
         employeeDAO.saveEmployee(employee);
    }
    @Override
     @Transactional
      public Employee getEmployee(int id) {
          return employeeDAO.getEmployee(id);
      }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
         employeeDAO.deleteEmployee(id);
      }
}
