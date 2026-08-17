package poo.sistema_cadastro_produtos.repository;

import poo.sistema_cadastro_produtos.model.Produto;
import poo.sistema_cadastro_produtos.service.ProdutoService;

import javax.swing.plaf.ProgressBarUI;
import java.util.ArrayList;
import java.util.List;


public class ProdutoRepository {

    ArrayList<Produto> listaProdutos = new ArrayList<>();

    int contador = 0;

    public int salvar(Produto produto) {
        listaProdutos.add(produto);
        int idproduto = ++contador;
        produto.setId(idproduto);
        return produto.getId();
    }

    public List<Produto> listarTodos() {
      return listaProdutos;
    }






}
