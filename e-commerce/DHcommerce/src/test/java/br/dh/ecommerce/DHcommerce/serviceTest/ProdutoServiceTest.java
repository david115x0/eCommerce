package br.dh.ecommerce.DHcommerce.serviceTest;

import br.dh.ecommerce.DHcommerce.entity.Categoria;
import br.dh.ecommerce.DHcommerce.entity.Produto;
import br.dh.ecommerce.DHcommerce.repository.ProdutoRepository;
import br.dh.ecommerce.DHcommerce.service.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ProdutoServiceTest {

    @Autowired
    private ProdutoService produtoService;

    @Before
    public void popular() {
        Categoria categoria = new Categoria(1, "categoriaTeste");

        Produto produto = new Produto(1, "teste", 100,
                "teste", "#", categoria);

        Produto produto1 = new Produto(2, "teste", 100,
                "teste", "#", categoria);
    }

}
