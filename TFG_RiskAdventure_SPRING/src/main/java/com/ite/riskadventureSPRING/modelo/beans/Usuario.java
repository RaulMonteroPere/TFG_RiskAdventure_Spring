package com.ite.riskadventureSPRING.modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USUARIO")
	private int idUsuario;

	private String apellidos;

	

	private String direccion;

	

	private String email;

	

	private int enabled;

	

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;

	

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	

	private String nombre;

	

	private String password;

	

	private String provincia;

	private String telefono;

	

	private String username;

	

	//bi-directional many-to-one association to UsuarioPerfile
	@OneToMany(mappedBy="usuario")
	private List<UsuarioPerfile> usuarioPerfiles;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	

	

	

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	

	

	

	

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	

	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	

	

	

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	

	

	

	

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	

	

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	

	

	

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<UsuarioPerfile> getUsuarioPerfiles() {
		return this.usuarioPerfiles;
	}

	public void setUsuarioPerfiles(List<UsuarioPerfile> usuarioPerfiles) {
		this.usuarioPerfiles = usuarioPerfiles;
	}

	public UsuarioPerfile addUsuarioPerfile(UsuarioPerfile usuarioPerfile) {
		getUsuarioPerfiles().add(usuarioPerfile);
		usuarioPerfile.setUsuario(this);

		return usuarioPerfile;
	}

	public UsuarioPerfile removeUsuarioPerfile(UsuarioPerfile usuarioPerfile) {
		getUsuarioPerfiles().remove(usuarioPerfile);
		usuarioPerfile.setUsuario(null);

		return usuarioPerfile;
	}

}