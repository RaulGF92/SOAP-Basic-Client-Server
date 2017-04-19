package es.raulgf92.webServices.intf;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import es.raulgf92.hibernate.model.Videogame;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface VideogameHandle{

	@WebMethod Videogame[] getAllVideogame();
	@WebMethod boolean newVideogame(Videogame videogame);
	@WebMethod boolean deleteVideogame(Videogame videogame);
	@WebMethod boolean updateVideogame(Videogame videogame);
	
}