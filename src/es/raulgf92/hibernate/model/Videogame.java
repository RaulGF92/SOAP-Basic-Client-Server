package es.raulgf92.hibernate.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Videogame")
public class Videogame implements Serializable {

	@Override
	public String toString() {
		return "Videogame [id=" + id + ", name=" + name + ", description=" + description + ", dateOfOut=" + dateOfOut
				+ ", valoration=" + valoration + ", plataforms=" + Arrays.toString(plataforms) + "]";
	}

	public Videogame(String name, String description, Date dateOfOut, int valoration, boolean[] plataforms) {
		super();
		this.name = name;
		this.description = description;
		this.dateOfOut = dateOfOut;
		this.valoration = valoration;
		this.plataforms = plataforms;
	}
	
	public Videogame(){
		this.name="";
		this.description="";
		this.dateOfOut=new Date();
		this.valoration=0;
		boolean[] aux={false,false,false,false};
		this.plataforms=aux;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateOfOut() {
		return dateOfOut;
	}
	public void setDateOfOut(Date dateOfOut) {
		this.dateOfOut = dateOfOut;
	}
	public int getValoration() {
		return valoration;
	}
	public void setValoration(int valoration) {
		this.valoration = valoration;
	}
	public boolean[] getPlataforms() {
		return plataforms;
	}
	public void setPlataforms(boolean[] plataforms) {
		this.plataforms = plataforms;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name",unique = false, nullable = false)
	private String name;
	
	@Column(name = "description",unique = false, nullable = false)
	private String description;
	
	@Column(name = "dateOfOut", unique = false, nullable = false)
	private Date dateOfOut;
	
	@Column(name = "valoration", unique = false, nullable = false)
	private int valoration;
	
	@Column(name = "plataforms", unique = false, nullable = false)
	private boolean[] plataforms=new boolean[4];
	
}
