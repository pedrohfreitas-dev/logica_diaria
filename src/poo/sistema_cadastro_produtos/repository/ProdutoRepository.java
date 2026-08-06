package poo.sistema_cadastro_produtos.repository;

import poo.sistema_cadastro_produtos.model.Produto;

import java.util.ArrayList;


public class ProdutoRepository {

    ArrayList<Produto> listaProdutos = new ArrayList<>();

    int contador = 0;

    public Produto salvar(Produto produto) {
        listaProdutos.add(produto);
        int idproduto = ++contador;
        produto.setId(idproduto);
        return listaProdutos.getLast();
    }


}
