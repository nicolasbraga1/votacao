package com.betrybe.sistemadevotacao;

/**
 * Cria a classe PessoaCandidata que herda de Pessoa.
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Construtor da classe.
   */
  public PessoaCandidata(String nome, int numero) {
    super.setNome(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public int getVotos() {
    return votos;
  }

  public String getNome() {
    return nome;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void receberVoto() {
    this.votos++;
  }
}
