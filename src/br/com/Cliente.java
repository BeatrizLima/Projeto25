package br.com;

import java.util.Date;

public class Cliente {
	
	private String pais;
	private Date dataCadastro;
	
	public Cliente (String pais, Date dataCadastro)
	{
		this.pais = pais;
		this.dataCadastro = dataCadastro;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}
