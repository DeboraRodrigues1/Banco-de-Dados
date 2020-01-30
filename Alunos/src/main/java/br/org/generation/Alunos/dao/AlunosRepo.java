package br.org.generation.Alunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.Alunos.model.Alunos;

public interface AlunosRepo extends CrudRepository<Alunos, Integer> {
	
}
