package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Acesso;
import models.Cargo;
import models.Pessoa;

public class ControleAcessoController {
  private List<Acesso> acessoList;

  public ControleAcessoController() {
    this.acessoList = new ArrayList<Acesso>();
  }

  public ControleAcessoController(List<Acesso> acessoList) {
    this.acessoList = acessoList;
  }

  public boolean cadastrarAcesso(Cargo cargo, Pessoa pessoa) {
    if((cargo == null) || (pessoa == null)) {
      return false;
    }

    Acesso acesso = consultarAcesso(cargo);

    if(acesso == null) {
      acesso = new Acesso(cargo);
    } else {
      acessoList.remove(acesso);
    }

    acesso.addPessoa(pessoa);
    acessoList.add(acesso);

    return true;
  }

  public boolean atualizaAcesso(Cargo cargo, Pessoa pessoa) {
    if((cargo == null) && pessoa == null) {
      return false;
    }

    Acesso acesso = consultarAcesso(cargo);

    if(acesso == null) {
      System.out.println("Acesso não enocntrado");
      return false;
    }

    if(acesso.getPessoaList().contains(pessoa)) {
      acesso.getPessoaList().remove(pessoa);
      return true;
    }

    return cadastrarAcesso(cargo, pessoa);
  }

  public Acesso consultarAcesso(Cargo cargo){
    return this.acessoList.stream()
      .filter(acesso -> acesso. getCargo().equals(cargo))
      .findFirst()
      .orElse(null);
  }
}
