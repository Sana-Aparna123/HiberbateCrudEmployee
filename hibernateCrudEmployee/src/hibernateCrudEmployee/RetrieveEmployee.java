package hibernateCrudEmployee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrieveEmployee {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
        //To retrieve all data		
		List<Employee> tempEmployee = session.createQuery("from Employee").list();
		for(Employee x:tempEmployee) {
			System.out.println(x);
		}
		//to retrieve single data
		Employee tempEmployees = (Employee) session.get(Employee.class, 1);
		System.out.println(tempEmployees);
		
		session.getTransaction().commit();
		
	}

}
