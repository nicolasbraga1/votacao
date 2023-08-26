package com.betrybe.sistemadevotacao;

/**
 * Cria a classe PessoaCandidata que herda de Pessoa.
 */
public class PessoaCandidata extends Pessoa {
  private Integer numero;
  private Integer votos;

  /**
   * Construtor da classe.
   */
  public PessoaCandidata(String nome, Integer numero) {
    super.setNome(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public Integer getNumero() {
    return numero;
  }

  public Integer getVotos() {
    return votos;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public void setVotos(Integer votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos++;
  }
}
