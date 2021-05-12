package br.com.escola.infra.aluno;

import br.com.escola.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {
    @Override
    public String cifrarSenha(String senha) {
        // IMplementatação hipotética
        return null;
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta) {
        return senhaCifrada.equals(cifrarSenha(senhaAberta));
    }
}
