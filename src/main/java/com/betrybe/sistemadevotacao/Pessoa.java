package com.betrybe.sistemadevotacao;

/**
 * Cria a classe abstrata Pessoa com atributo nome e seu getter e setter.
 */
public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
