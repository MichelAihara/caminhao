package br.com.carbone.caminhao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
		
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("transporte");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	
	}
}
