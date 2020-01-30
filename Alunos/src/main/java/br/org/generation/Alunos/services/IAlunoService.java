package br.org.generation.Alunos.services;

import java.util.List;

import br.org.generation.Alunos.model.Alunos;

public interface IAlunoService {
	public List<Alunos> recuperarTodos();
	public Alunos recuperarPorId(int id);
}


