package college;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Collegedata {
	@Id
	int collegeid;
	String collegename;
	
	public static void main(String[] args) {
	Collegedata c=new Collegedata();
	c.collegeid=123;
	c.collegename="BkEC";
     EntityManagerFactory emf =Persistence.createEntityManagerFactory("college");	
	          EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	et.begin();
	em.persist(c);
	et.commit();
	

	}

}
