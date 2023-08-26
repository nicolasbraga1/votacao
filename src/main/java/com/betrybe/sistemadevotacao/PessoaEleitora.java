package com.betrybe.sistemadevotacao;

/**
 * Cria classe PessoaEleitora.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Construtor da classe.
   */
  public PessoaEleitora(String cpf) {
    super.setNome(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
