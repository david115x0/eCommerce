package br.dh.ecommerce.DHcommerce.service;


import br.dh.ecommerce.DHcommerce.entity.Categoria;
import br.dh.ecommerce.DHcommerce.repository.CategoriaRepository;
import br.dh.ecommerce.DHcommerce.repository.configuracao.ConfiguracaoJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    private ConfiguracaoJDBC configurationJDBC;

    public CategoriaService() {
        this.configurationJDBC = new ConfiguracaoJDBC();
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
    public Categoria atualizar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    public void excluir(Integer id) {
        categoriaRepository.deleteById(id);
    }

    public Optional<Categoria> buscarPorId(Integer id) {
        return categoriaRepository.findById(id);
    }

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }
}
