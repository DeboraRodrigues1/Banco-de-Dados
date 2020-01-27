package br.org.generation.sistemaalunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                   //Indico que a class aluno é uma entidade armazenavel em banco 
@Table(name="tbl_aluno")  // associo explicitamente o nome da tabela que armazena
public class Aluno {
	
	@Column(name="ra")    //define que o atributo agora é uma coluna da tabela
	@Id  // esse atributo é chave-primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indico que RA é auto-gerado pelo base de dados
	private int ra;
	
	@Column(name="nome", length = 100) // indico o nome e o tamanho da coluna
	private String nome;
	
	@Column(name="email", length = 100, unique = true)
	private String email;
	
	@Column(name="telefone", length = 20)
	private String telefone;
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
