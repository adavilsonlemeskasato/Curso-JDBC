package br.talalricos.teste;

import br.talalricos.dao.AlunoDAO;
import br.talalricos.entity.Aluno;

import java.util.List;

public class testeInsere {

	public static void main(String[] args) {
	
//		Aluno fodac = new Aluno("Onias filho","Casa dele","30274758");
//		
//		AlunoDAO dao = new AlunoDAO();
//		
//		dao.criaAluno(fodac);


//
//		Aluno fodac = new Aluno();
//
//		AlunoDAO dao = new AlunoDAO();
//
//		fodac=dao.getById(2l);
//
//		System.out.println(fodac.getNome());
//


		AlunoDAO dao = new AlunoDAO();
		List<Aluno> alunos =dao.getAlunos();

		for (Aluno a1: alunos) {
			System.out.println(a1.getNome());
		}
		
	}

}
