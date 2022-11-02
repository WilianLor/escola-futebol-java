package models;

import java.util.ArrayList;
import java.util.List;

public class Acesso {
  private Cargo cargo;
  private List<Pessoa> pessoaList = new ArrayList<Pessoa>();

  public Acesso(Cargo cargo) {
    this.cargo = cargo;
  }

  public void addPessoa(Pessoa pessoa) {
    pessoaList.add(pessoa);
  }

  public void removePessoa(Pessoa pessoa) {
    pessoaList.remove(pessoa);
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setPessoaList(List<Pessoa> pessoaList) {
    this.pessoaList = pessoaList;
  }

  public List<Pessoa> getPessoaList() {
    return pessoaList;
  }
}
