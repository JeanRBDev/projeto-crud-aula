package com.apirest.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDados {
	private final RepositorioDados repository;

	ControllerDados(RepositorioDados repository) {
		this.repository = repository;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/listar")
	List<Dados> listarAlunos() {
		return repository.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/cadastrar")
	Dados novoAluno(@RequestBody Dados dados) {
		return repository.save(dados);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/get/{id}")
	Dados getAluno(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new DadosNotFoundException(id));
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/atualizar/{id}")
	Dados atualizarAluno(@RequestBody Dados dadosNovo, @PathVariable Long id) {
		return repository.findById(id).map(dados -> {
			dados.setNome(dadosNovo.getNome());
			dados.setCpf(dadosNovo.getCpf());
			return repository.save(dados);
		}).orElseGet(() -> {
			dadosNovo.setId(id);
			return repository.save(dadosNovo);
		});
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("/remover/{id}")
	void removerAluno(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
