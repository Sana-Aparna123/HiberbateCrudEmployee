package hibernateCrudEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		Employee tempEmployee=(Employee) session.get(Employee.class, 3);
		session.delete(tempEmployee);
        session.getTransaction().commit();

	}

}
