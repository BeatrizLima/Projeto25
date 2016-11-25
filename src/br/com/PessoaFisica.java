package br.com;

import java.util.Date;

public class PessoaFisica extends Cliente{
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public PessoaFisica(String pais, Date dataCadastro, String nome, String sobrenome, String cpf){
		super(pais,dataCadastro);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}
