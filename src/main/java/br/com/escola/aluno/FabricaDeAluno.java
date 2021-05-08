package br.com.escola.aluno;

public class FabricaDeAluno {

    // Esta mais pra Builder do que pra FactoryMethod

    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionaTelefone(ddd,numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }
}
