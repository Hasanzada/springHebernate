package az.ruslan.SpringHibernate;

import az.ruslan.SpringHibernate.model.Employee;
import az.ruslan.SpringHibernate.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Services services = Services.getInstance();
        EmployeeService employeeService = services.getEmployeeService();
        
        Employee employee = new Employee();
        employee.setName("Eli");
        employee.setSurname("Veliyev");
        employee.setAge(25);
        employee.setSalary(700);
        employee.setId(7);
        
        employeeService.update(employee);
        
        for (Employee emp : employeeService.getAllEmployees()) {
			System.out.println(emp);
		}
        
        System.out.println();
        
        System.out.println(employeeService.getEmployeeById(1));
        
    }
}
