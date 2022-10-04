/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurana.spring.mvc_hibernate_aop.dao;

import com.nurana.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
//        List<Employee> allEmployees=session.createQuery("from Employee", Employee.class)
//                .getResultList();
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query
                .getResultList();
        return allEmployees;
    }

    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
      Session session = sessionFactory.getCurrentSession();
      return session.get(Employee.class, id);
      
    }
    public void deleteEmployee(int id){
        Session session = sessionFactory.getCurrentSession();
     
       Query<Employee> query = session.createQuery("delete from Employee "
               + "where id=:employeeId");
         query.setParameter("employeeId", id);
                query.executeUpdate();
        
}
}
