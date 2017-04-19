package es.raulgf92.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import es.raulgf92.hibernate.model.Usuario;
import es.raulgf92.hibernate.model.Videogame;

public class Dao {

	public static boolean saveVideogame(Videogame videogame){
		
		if(videogame instanceof Videogame){
			saveObject(videogame);
			return true;
		}
		
		return false;
	}
	
	public static boolean saveUser(Usuario user){
		
		if(user instanceof Usuario){
			saveObject(user);
			return true;
		}
		
		return false;
	}
	
	public static Videogame[] listVideogame() {

		Transaction tx = null;
		Videogame[] response=new Videogame[0];
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			tx = session.beginTransaction();
			List<Videogame> videogames = session.createQuery("FROM Videogame").list();
			
			for (Iterator iterator1 = videogames.iterator(); iterator1.hasNext();) {
				Videogame videogame = (Videogame) iterator1.next();
				System.out.println(videogame.toString());
			}
			response=videogames.toArray(new Videogame[videogames.size()]);
			tx.commit();
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return response;
	}
	
	public static  Usuario[] listUsuarios() {

		Transaction tx = null;
		Usuario[] response=new Usuario[0];
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			tx = session.beginTransaction();
			List<Usuario> usuarios = session.createQuery("from Usuario").list();
			
			for (Iterator iterator1 = usuarios.iterator(); iterator1.hasNext();) {
				Usuario usuario = (Usuario) iterator1.next();
				System.out.println(usuario.toString());
			}
			response=usuarios.toArray(new Usuario[usuarios.size()]);
			tx.commit();
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return response;
	}
	
	private static void saveObject(Object object){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
        session.beginTransaction();
        //Save the user in database
        session.save(object);
 
        //Commit the transaction
        session.getTransaction().commit();
        session.clear();
        session.close();
	}
}
