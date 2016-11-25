package br.com;

import java.util.Date;

public class PessoaJuridica extends Cliente{
	
	public String razaoSocial;
	public String nomeFantasia;
	public String cnpj;
	
	public PessoaJuridica(String pais, Date dataCadastro, String razaoSocial, String nomeFantasia, String cnpj){
		super(pais,dataCadastro);
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
