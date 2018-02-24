/**
 * 
 */
package br.com.cars.business.dto;

import java.io.Serializable;

/**
 * @author David Krenkel <david.melo1992@gmail.com>
 *
 */
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private String cpf;

	private String email;

	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}