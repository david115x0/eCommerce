package br.dh.ecommerce.DHcommerce.controller;


import br.dh.ecommerce.DHcommerce.entity.Produto;
import br.dh.ecommerce.DHcommerce.service.CategoriaService;
import br.dh.ecommerce.DHcommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @PostMapping()
    public ResponseEntity<Produto> cadstrar(@RequestBody Produto produtoDto) {
        return ResponseEntity.ok(produtoService.salvar(produtoDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(produtoService.buscarPorId(id).orElse(null));
    }

    @PutMapping
    public ResponseEntity<Produto> atualizar(@RequestBody Produto produto) {
        ResponseEntity<Produto> response = null;
        if (produto.getId() != null && produtoService.buscarPorId(produto.getId()).isPresent())
            response = ResponseEntity.ok(produtoService.salvar(produto));
        else
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluir(@PathVariable Integer id) {
        ResponseEntity<String> response = null;
        if (produtoService.buscarPorId(id).isPresent()) {
            produtoService.excluir(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Produto excluído");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @GetMapping
    public ResponseEntity<Iterable<Produto>> buscarTodos() {
        return ResponseEntity.ok(produtoService.buscarTodos());
    }
}
