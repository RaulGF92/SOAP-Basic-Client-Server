package es.raulgf92;

import java.util.Date;

import javax.xml.ws.Endpoint;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import es.raulgf92.hibernate.Dao;
import es.raulgf92.hibernate.HibernateUtil;
import es.raulgf92.hibernate.model.Usuario;
import es.raulgf92.hibernate.model.Videogame;
import es.raulgf92.webServices.impl.VideogameHandleImpl;

public class Application {
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endpoint.publish("http://localhost:7013/videogames",new VideogameHandleImpl());
        
		Usuario usuario1=new Usuario("raulgf92@gmail.com","contrasena", new Date());
        Usuario usuario2=new Usuario("jose2@gmail.com","contrasena", new Date());
        
        Dao.saveUser(usuario1);
        Dao.saveUser(usuario2);
           
        //----------------------------------------------
        
        Videogame videogame=new Videogame();
        videogame.setName("FIFA 16");
        videogame.setDescription("Juego de futbol de la compañia EA");
        videogame.setPlataforms(new boolean[4]);
        videogame.setValoration(8);
        videogame.setDateOfOut(new Date());
        
        Videogame videogame2=new Videogame();
        videogame2.setName("FIFA 16");
        videogame2.setDescription("Juego de futbol de la compañia EA");
        videogame2.setPlataforms(new boolean[4]);
        videogame2.setValoration(8);
        videogame2.setDateOfOut(new Date());
        
        Dao.saveVideogame(videogame);
        Dao.saveVideogame(videogame2);
        
  
	}
	
}
