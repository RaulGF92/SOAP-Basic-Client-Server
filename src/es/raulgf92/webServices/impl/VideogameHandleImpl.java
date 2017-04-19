package es.raulgf92.webServices.impl;

import javax.jws.WebService;

import es.raulgf92.hibernate.Dao;
import es.raulgf92.hibernate.model.Videogame;
import es.raulgf92.webServices.intf.VideogameHandle;

//Service Implementation
@WebService(endpointInterface = "es.raulgf92.webServices.intf.VideogameHandle")
public class VideogameHandleImpl implements VideogameHandle{

	@Override
	public Videogame[] getAllVideogame() {
		// TODO Auto-generated method stub
		return Dao.listVideogame();
	}

	@Override
	public boolean newVideogame(Videogame videogame) {
		// TODO Auto-generated method stub
		return Dao.saveVideogame(videogame);
	}

	@Override
	public boolean deleteVideogame(Videogame videogame) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateVideogame(Videogame videogame) {
		// TODO Auto-generated method stub
		return false;
	}

	

}