package br.dh.ecommerce.DHcommerce.service;


import br.dh.ecommerce.DHcommerce.entity.Produto;
import br.dh.ecommerce.DHcommerce.repository.ProdutoRepository;
import br.dh.ecommerce.DHcommerce.repository.configuracao.ConfiguracaoJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    private CategoriaService categoriaService;

    public ProdutoService(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    public Produto atualizar(Produto produto){
        return produtoRepository.save(produto);
    }
    public void excluir(Integer id) {
        produtoRepository.deleteById(id);
    }

    public Optional<Produto> buscarPorId(Integer id) {
        return produtoRepository.findById(id);
    }

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }
}
