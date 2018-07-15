package az.ruslan.SpringHibernate.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import az.ruslan.SpringHibernate.dao.EmployeeDao;
import az.ruslan.SpringHibernate.model.Employee;
import az.ruslan.SpringHibernate.sessionfactory.AbstractSessionObject;

@Repository
public class EmployeeDaoImpl extends AbstractSessionObject implements EmployeeDao {

	@Override
	public void insert(Employee employee) {
		getSession().save(employee);
	}

	@Override
	public void update(Employee employee) {
		getSession().update(employee);
	}

	@Override
	public void delete(int employeeId) {
		getSession().delete(getEmployeeById(employeeId));
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return (Employee)getSession().get(Employee.class, employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return getSession().getNamedQuery("allEmployee").list();
	}

}
