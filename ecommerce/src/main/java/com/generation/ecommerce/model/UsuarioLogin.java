package com.generation.ecommerce.model;

public class UsuarioLogin {
	
	private String usuario;
	
	private String senha;
	
	private String token;
	
	private boolean vendedor;

	public String getUsuario() {
		return usuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isVendedor() {
		return vendedor;
	}	

	public void setVendedor(boolean vendedor) {
		this.vendedor = vendedor;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
