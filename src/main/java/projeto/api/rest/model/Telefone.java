package projeto.api.rest.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telefone {

	@Id // primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String numero;

	@JsonIgnore
	@org.hibernate.annotations.ForeignKey(name="usuario_id")
	@ManyToOne(optional = false)// Muitos para um - Not Null
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
