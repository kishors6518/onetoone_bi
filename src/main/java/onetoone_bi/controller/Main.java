package onetoone_bi.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import onetoone_bi.dao.PersonDao;
import onetoone_bi.dto.AdharCard;
import onetoone_bi.dto.Person;

public class Main {

	public static void main(String[] args) {
		
//		PersonDao dao = new PersonDao();
//		Scanner scanner = new Scanner(System.in);
//		Person person = new Person();
//		person.setName("Aditya");
//		person.setPhone(9845612378l);
//		person.setAddress("Satara");
//
//		AdharCard ac = new AdharCard();
//		ac.setName("Aditya Gaikwad");
//		ac.setAddress("Satara");
//		ac.setPerson(person);
//
//		person.setAc(ac);

		EntityManager manager = Persistence.createEntityManagerFactory("kishor").createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		//manager.persist(person);
//		manager.persist(ac);
//		transaction.commit();
		
			AdharCard ac=manager.find(AdharCard.class,2);
			if(ac!=null)
			{
				System.out.println(ac);
			}
			else
			{
				System.out.println("AdharCard not found");
			}

	}

}
