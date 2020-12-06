package br.talalricos.entity;

public class Aluno {

	private Long id;
	private String nome;
	private String endereco;
	private String Telefone;

	public Aluno() {

	}
	
	

	public Aluno(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		Telefone = telefone;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", Telefone=" + Telefone + "]";
	}
	
	
}
