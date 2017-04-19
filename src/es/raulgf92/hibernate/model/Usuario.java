package es.raulgf92.hibernate.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Usuario",uniqueConstraints={
		@UniqueConstraint(columnNames = "id"),
		@UniqueConstraint(columnNames = "usuario")
})
public class Usuario implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Usuario(){
		
	}
	
	public Usuario(String usuario, String password, Date fecha) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.fecha = fecha;
	}

	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", unique=true, nullable=false)
	private Integer id;
	
	@Column(name="usuario", unique=true, nullable=false)
	private String usuario;
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", password=" + password + ", fecha=" + fecha + "]";
	}

	@Column(name="password", unique=false, nullable=false)
	private String password;
	
	@Column(name="fecha", unique=false, nullable=false)
	private Date fecha;
}
