package br.dh.ecommerce.DHcommerce.controller;

import br.dh.ecommerce.DHcommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity buscarTodosNomes() {
        return ResponseEntity.ok(categoriaService.buscarTodosNomes());
    }

    //@GetMapping(path = "produtos/categorias/{nomeCategoria}")
    //public Iterable<Categoria> buscarPorNome(@PathVariable String nomeCategoria) {
    //    return categoriaService.findByName(nomeCategoria);
    //}

}
