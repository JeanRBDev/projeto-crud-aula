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
public class ControllerAlunos {
	private final RepositorioAlunos repository;

	ControllerAlunos(RepositorioAlunos repository) {
		this.repository = repository;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/listar")
	List<Aluno> listarAlunos() {
		return repository.findAll();
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/cadastrar")
	Aluno novoAluno(@RequestBody Aluno aluno) {
		return repository.save(aluno);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/get/{id}")
	Aluno getAluno(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new AlunoNotFoundException(id));
	}

	@CrossOrigin(origins = "*")
	@PutMapping("/atualizar/{id}")
	Aluno atualizarAluno(@RequestBody Aluno alunoNovo, @PathVariable Long id) {
		return repository.findById(id).map(aluno -> {
			aluno.setNome(alunoNovo.getNome());
			aluno.setCpf(alunoNovo.getCpf());
			return repository.save(aluno);
		}).orElseGet(() -> {
			alunoNovo.setId(id);
			return repository.save(alunoNovo);
		});
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping("/remover/{id}")
	void removerAluno(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
