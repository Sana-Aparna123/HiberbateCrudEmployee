package hibernateCrudEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class insertEmployee {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session =factory.getCurrentSession();
		session.beginTransaction();
        Employee tempEmployee=new Employee("Srikala","Raja","srikala@gmail.com");
        session.save(tempEmployee);
        session.getTransaction().commit();

	}

}
