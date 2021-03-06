package az.ruslan.SpringHibernate.dao;

import java.util.List;

import az.ruslan.SpringHibernate.model.Employee;

public interface EmployeeDao {

	void insert(Employee employee);
	
	void update(Employee employee);
	
	void delete(int employeeId);
	
	Employee getEmployeeById(int employeeId);
	
	List<Employee>getAllEmployees();
	
}
