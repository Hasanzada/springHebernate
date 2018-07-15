package az.ruslan.SpringHibernate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import az.ruslan.SpringHibernate.dao.EmployeeDao;
import az.ruslan.SpringHibernate.model.Employee;
import az.ruslan.SpringHibernate.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	@Override
	public void insert(Employee employee) {
		employeeDao.insert(employee);		
	}

	@Transactional
	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);		
	}

	@Transactional
	@Override
	public void delete(int employeeId) {
		employeeDao.delete(employeeId);
	}

	@Transactional
	@Override
	public Employee getEmployeeById(int employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}

	@Transactional
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}
