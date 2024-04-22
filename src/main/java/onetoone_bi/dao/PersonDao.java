package onetoone_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_bi.dto.AdharCard;
import onetoone_bi.dto.Person;

public class PersonDao {

	public EntityManager getManager()
	{
		 return Persistence.createEntityManagerFactory("kishor").createEntityManager();
		 
	}
	public void savePerson(Person person, AdharCard ac)
	{
		EntityTransaction transaction=getManager().getTransaction();
		transaction.begin();
		getManager().persist(person);
		getManager().persist(ac);
		transaction.commit();
	}
}
