package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Lais!</b>";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "<br>Mentalidade de Crescimento</b><br>Persistencia<br>Responsabilidade Pessoal<br>Orientação ao Futuro<br>Comunicação<br>Orientação ao Detalhe<br>Proatividade<br>Trabalho em Equipe";
}
	@GetMapping("/objetivo")
	public String objetivo() {
		return "<br>Realizar todas as atividades propostas</b><br>Ter mais foco para compreender todo o conteudo<br>Avaliar meu autoconhecimento<br>Ter diciplina para realizar todas tarefas diarias";
	}
}

	
