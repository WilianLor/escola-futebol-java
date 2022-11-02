package models;

public class Pessoa {
  private String nome;
  private String cpf;
  private String dataNascimento;
  private Endereco endereco;

  public Pessoa() {
    nome = "";
    cpf = "";
    dataNascimento = "";
    endereco = new Endereco();
  }

  public Pessoa(String nome, String cpf, String dataNascimento, Endereco endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
    this.endereco = endereco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public Endereco getEndereco() {
    return endereco;
  }
 }
