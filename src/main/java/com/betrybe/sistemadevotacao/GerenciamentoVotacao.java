package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Cria a classe GerenciamentoVotacao que implementa GerenciamentoVotacaoInterface.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  public static ArrayList<PessoaCandidata> pessoasCandidatas;
  public static ArrayList<PessoaEleitora> pessoasEleitoras;
  public static ArrayList<String> cpfsComputados;

  /**
   * Construtor da classe.
   */
  public GerenciamentoVotacao() {
    GerenciamentoVotacao.pessoasCandidatas = new ArrayList<>();
    GerenciamentoVotacao.pessoasEleitoras = new ArrayList<>();
    GerenciamentoVotacao.cpfsComputados = new ArrayList<>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    if (pessoasCandidatas.isEmpty()) {
      PessoaCandidata novaCandidata = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(novaCandidata);
    } else {
      for (PessoaCandidata pessoa : pessoasCandidatas) {
        if (pessoa.getNumero() == numero) {
          System.out.println("Número da pessoa candidata já utilizado!");
          return;
        }
      }
      PessoaCandidata novaCandidata = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(novaCandidata);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    if (pessoasEleitoras.isEmpty()) {
      PessoaEleitora novaEleitora = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novaEleitora);
    } else {
      for (PessoaEleitora pessoa : pessoasEleitoras) {
        if (pessoa.getCpf().equals(cpf)) {
          System.out.println("Pessoa eleitora já cadastrada!");
          return;
        }
      }
      PessoaEleitora novaEleitora = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novaEleitora);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (!cpfsComputados.isEmpty()) {
      for (String cpf : cpfsComputados) {
        if (cpf.equals(cpfPessoaEleitora)) {
          System.out.println("Pessoa eleitora já votou!");
          return;
        }
      }
    }
    for (PessoaCandidata pessoa : pessoasCandidatas) {
      if (pessoa.getNumero() == numeroPessoaCandidata) {
        pessoa.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
        return;
      }
    }
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
    for (PessoaCandidata candidata : pessoasCandidatas) {
      System.out.println("Nome: " + candidata.getNome()
          + " - " + candidata.getVotos() + " votos ( "
          + (Math.round((candidata.getVotos() * 100.00 / cpfsComputados.size()))) + "% )");
    }
    System.out.println("Total de votos: " + cpfsComputados.size());
  }
}
