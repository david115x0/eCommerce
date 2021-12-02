package br.dh.ecommerce.DHcommerce.controller;

import br.dh.ecommerce.DHcommerce.entity.Categoria;
import br.dh.ecommerce.DHcommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos/categorias")
public class ProdutosCategoriaController {

    // To do: Dois últimos brekpoints
    private CategoriaService categoriaService;

    @Autowired
    public ProdutosCategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ResponseEntity<List<String>> buscarTodosNomes() {

        return ResponseEntity.ok(categoriaService.buscarTodosNomes());
    }

    @GetMapping("/{nomeCategoria}")
    public Categoria buscarPorNome(@PathVariable("nomeCategoria") String nomeCategoria) {
       return categoriaService.findByName(nomeCategoria);
    }
}
