package com.betrybe.sistemadevotacao;

/**
 * Cria classe PessoaEleitora que herda de Pessoa.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Construtor da classe.
   */
  public PessoaEleitora(String nome, String cpf) {
    super.setNome(nome);
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
