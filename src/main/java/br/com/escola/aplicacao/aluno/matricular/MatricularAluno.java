package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorio = repositorioDeAlunos;
    }

    // Design Pattern - COMMAND
    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }

}
