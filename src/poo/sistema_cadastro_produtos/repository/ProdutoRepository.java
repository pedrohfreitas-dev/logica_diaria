package poo.sistema_cadastro_produtos.repository;

import poo.sistema_cadastro_produtos.exceptions.ProdutoNaoEncontradoException;
import poo.sistema_cadastro_produtos.model.Produto;
import java.util.ArrayList;
import java.util.List;


public class ProdutoRepository {

    ArrayList<Produto> listaProdutos = new ArrayList<>();

    int contador = 0;

    public Produto salvar(Produto produto) {
        listaProdutos.add(produto);
        int idproduto = ++contador;
        produto.setId(idproduto);
        return produto;
    }

    public List<Produto> listarTodos() {
      return listaProdutos;
    }

    public Produto buscarPorId(int id) {
        for (Produto produto : listaProdutos) {
            if (id == produto.getId()) {
                return produto;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto não encontrado");
    }



}
