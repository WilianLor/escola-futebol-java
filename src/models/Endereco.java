package models;

public class Endereco {
  private int numero;
  private String rua;
  private String bairro;
  private String cidade;

  public Endereco() {
    numero = 0;
    rua = "";
    bairro = "";
    cidade = "";
  }

  public Endereco(int numero, String rua, String bairro, String cidade) {
    this.numero = numero;
    this.rua = rua;
    this.bairro = bairro;
    this.cidade = cidade;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public int getNumero() {
    return numero;
  }

  public String getRua() {
    return rua;
  }

  public String getBairro() {
    return bairro;
  }

  public String getCidade() {
    return cidade;
  }
}
