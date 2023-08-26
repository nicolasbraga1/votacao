package com.betrybe.sistemadevotacao;

/**
 * Cria classe PessoaEleitora.
 */
public class PessoaEleitora extends Pessoa {
  private String nome;
  private String cpf;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
