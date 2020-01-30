package br.org.generation.Alunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.Alunos.dao.AlunosRepo;
import br.org.generation.Alunos.model.Alunos;

@Component
public class AlunoImpl implements IAlunoService {
	
	@Autowired 
	private AlunosRepo repo;
	
	@Override
	public List<Alunos> recuperarTodos(){
		return (List<Alunos>)repo.findAll(); 
	}
	
	@Override
	public Alunos recuperarPorId(int id) {
	return repo.findById(id).get();
	}
}


