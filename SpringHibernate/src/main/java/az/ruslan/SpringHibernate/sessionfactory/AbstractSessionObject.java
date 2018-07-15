package az.ruslan.SpringHibernate.sessionfactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractSessionObject {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
}
