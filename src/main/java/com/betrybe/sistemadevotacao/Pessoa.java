package com.betrybe.sistemadevotacao;

/**
 * Cria a classe abstrata Pessoa com atributo nome e seu getter e setter.
 */
public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return nome;
  }

  public String setNome(String nome) {
    return this.nome = nome;
  }
}
