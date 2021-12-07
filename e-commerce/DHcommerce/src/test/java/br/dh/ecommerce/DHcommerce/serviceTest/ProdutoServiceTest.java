package br.dh.ecommerce.DHcommerce.serviceTest;

import br.dh.ecommerce.DHcommerce.entity.Produto;
import br.dh.ecommerce.DHcommerce.service.ProdutoService;
import org.junit.Assert;
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

    @Test
    public void buscarPorIdTeste() {
        Optional<Produto> produto = produtoService.buscarPorId(11);

        Assert.assertTrue(produto.isPresent());
    }
}
