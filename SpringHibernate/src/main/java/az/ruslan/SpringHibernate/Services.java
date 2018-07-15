package az.ruslan.SpringHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import az.ruslan.SpringHibernate.service.EmployeeService;





public class Services {

	private EmployeeService employeeService;
	private static Services instance;
	
	public static Services getInstance() {
		if(instance == null)
			instance = new Services();
		
		return instance;
	}
	
	private Services() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		employeeService = applicationContext.getBean(EmployeeService.class);
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
}
