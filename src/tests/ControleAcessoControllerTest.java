package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controllers.ControleAcessoController;

import models.Acesso;
import models.Cargo;
import models.Pessoa;

public class ControleAcessoControllerTest {
  private ControleAcessoController ControleAcessoController;

    @Before
    public void before(){
      ControleAcessoController = new ControleAcessoController();
    }

    @Test
    public void testCadastrarAcessomSucesso(){
      Cargo cargo = Cargo.TREINADOR;
      Pessoa pessoa = new Pessoa();

      boolean acessado = ControleAcessoController.cadastrarAcesso(cargo, pessoa);

      Assert.assertTrue(acessado);
    }

    @Test
    public void testCadastrarAcessoSemCargoErro(){
      Cargo cargo = null;
      Pessoa pessoa = new Pessoa();

      boolean acessado = ControleAcessoController.cadastrarAcesso(cargo, pessoa);

      Assert.assertFalse(acessado);
    }


    @Test
    public void testCadastrarAcessoSemPessoaErro(){
      Cargo cargo = Cargo.TREINADOR;
      Pessoa pessoa = null;

      boolean acessado = ControleAcessoController.cadastrarAcesso(cargo, pessoa);

      Assert.assertFalse(acessado);
    }

    @Test
    public void testAtualizarRemovendoAcessoSucesso(){
      Cargo cargo = Cargo.TREINADOR;
      Pessoa pessoa = new Pessoa();
        
      Acesso acesso = new Acesso(cargo);
      acesso.addPessoa(pessoa);
      
      ControleAcessoController controleAcessoController = new ControleAcessoController(new ArrayList<Acesso>(Arrays.asList(acesso)));
        
      boolean acessado = controleAcessoController.atualizaAcesso(cargo, pessoa);

      Assert.assertTrue(acessado);
    }

    @Test
    public void testAtualizarAdicionadoAcessoSucesso(){
      Cargo cargo = Cargo.TREINADOR;
      Pessoa pessoa = new Pessoa();
        
      Acesso acesso = new Acesso(cargo);
      
      ControleAcessoController controleAcessoController = new ControleAcessoController(new ArrayList<Acesso>(Arrays.asList(acesso)));
        
      boolean acessado = controleAcessoController.atualizaAcesso(cargo, pessoa);

      Assert.assertTrue(acessado);
    }

    @Test
    public void testAtualizarSemAcessoErro(){
      Cargo cargo = Cargo.TREINADOR;
      Pessoa pessoa = new Pessoa();

      boolean acessado = ControleAcessoController.atualizaAcesso(cargo, pessoa);

      Assert.assertFalse(acessado);
    }

    @Test
    public void testAtualizarSemCargoErro(){
      Cargo cargo = null;
      Pessoa pessoa = new Pessoa();
      Acesso acesso = new Acesso(cargo);
      acesso.addPessoa(pessoa);

      ControleAcessoController controleAcessoController  = new ControleAcessoController(new ArrayList<>(Arrays.asList(acesso)));

      boolean acessado = controleAcessoController.atualizaAcesso(cargo, pessoa);

      Assert.assertFalse(acessado);
    }

    @Test
    public void testAtualizarSemPessoaErro(){
      Cargo cargo = Cargo.TREINADOR;
      Pessoa pessoa = null;
      Acesso acesso = new Acesso(cargo);
      acesso.addPessoa(pessoa);

      ControleAcessoController controleAcessoController  = new ControleAcessoController(new ArrayList<>(Arrays.asList(acesso)));

      boolean acessado = controleAcessoController.atualizaAcesso(cargo, pessoa);

      Assert.assertFalse(acessado);
    }
}
