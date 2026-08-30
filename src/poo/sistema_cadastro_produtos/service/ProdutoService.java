package poo.sistema_cadastro_produtos.service;

import poo.sistema_cadastro_produtos.dto.ProdutoDTO;
import poo.sistema_cadastro_produtos.model.Produto;
import poo.sistema_cadastro_produtos.repository.ProdutoRepository;
import poo.sistema_conta_bancaria.exceptions.ValorInvalidoException;

public class ProdutoService {

    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }


    public Produto cadastrar(ProdutoDTO dto) {
        if (dto.getPreco() > 0) {
            Produto produto  = new Produto(dto.getPreco(),dto.getNome());
            Produto produtoSalvo = repository.salvar(produto);
            return produtoSalvo;
        }
        throw new ValorInvalidoException("Valor Inválido");
    }

    public Produto buscar(int id) {
        return repository.buscarPorId(id);
    }

}
