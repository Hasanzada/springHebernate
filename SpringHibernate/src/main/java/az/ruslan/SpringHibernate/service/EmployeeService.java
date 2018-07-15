package az.ruslan.SpringHibernate.service;

import java.util.List;

import az.ruslan.SpringHibernate.model.Employee;


public interface EmployeeService {

void insert(Employee employee);
	
	void update(Employee employee);
	
	void delete(int employeeId);
	
	Employee getEmployeeById(int employeeId);
	
	List<Employee>getAllEmployees();
}
