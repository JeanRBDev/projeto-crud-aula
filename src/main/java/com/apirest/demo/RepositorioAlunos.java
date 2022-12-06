package com.apirest.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAlunos extends JpaRepository<Aluno, Long> {

}
