package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Employee> getEmployeers() {
		
		
		Session currentSession = sessionFactory.getCurrentSession();
				
		
		Query<Employee> theQuery = 
				currentSession.createQuery("from Employee order by lastName",
											Employee.class);
		
		
		List<Employee> employeers = theQuery.getResultList();
				
			
		return employeers;
	}

	@Override
	public void saveEmployee(Employee theEmployee) {

		
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		currentSession.saveOrUpdate(theEmployee);//!!!
		
	}

	@Override
	public Employee getEmployee(int theId) {
		
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		Employee theEmployee = currentSession.get(Employee.class, theId);
		
		return theEmployee;
	}

	@Override
	public void deleteEmployee(int theId) {
		
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		Query theQueury = currentSession.createQuery("delete from Employee where id=:employeeId");
		theQueury.setParameter("employeeId",theId);
				
		theQueury.executeUpdate();
	}

}






