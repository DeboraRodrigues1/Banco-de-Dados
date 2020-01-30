package br.org.generation.Alunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.Alunos.model.Alunos;
import br.org.generation.Alunos.services.IAlunoService;



@RestController
@CrossOrigin("*")
public class AlunosController {

	@Autowired
	private IAlunoService servico; 
	
	
	@GetMapping("/alunos")
	public ResponseEntity<List<Alunos>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
		
	}
	
	@GetMapping("/alunos/{id}")
	public ResponseEntity<Alunos> mostrarPeloId(@PathVariable int id){
		Alunos p = servico.recuperarPorId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
}
 



