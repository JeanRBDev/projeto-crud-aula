package com.apirest.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ALUNO")
public class Aluno {
	/*NÃO MEXER AQUI*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	/*FIM - NÃO MEXER AQUI*/

	@Column(name = "NOME", length = 100, nullable = false)
	private String nome;

	@Column(name = "CPF", length = 11, nullable = false)
	private String cpf;

	@Column(name = "NASCIMENTO", nullable = false)
	private Timestamp dataNascimento;

	@Column(name = "RG", length = 13, nullable = false)
	private String rg;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "ENDERECO", nullable = false)
	private String endereco;

	@Column(name = "DEFICIENCIA", length = 50, nullable = false)
	private String deficiencia;

	@Column(name = "LAUDO", nullable = false)
	private Boolean laudo;

	@Column(name = "OBS", length = 1000, nullable = true)
	private String obs;
}
