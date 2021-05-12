package br.com.escola;

import br.com.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.escola.infra.aluno.RepositoriosDeAlunosJDBC;

public class MatricularAlunoLinhaComando {

    public static void main(String[] args) {
        String nome = "André";
        String cpf = "111.111.111-11";
        String email = "andre@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositoriosDeAlunosJDBC( /*...*/ ));
        matricularAluno.executa(
                new MatricularAlunoDto(nome, cpf, email)
        );
    }

}
