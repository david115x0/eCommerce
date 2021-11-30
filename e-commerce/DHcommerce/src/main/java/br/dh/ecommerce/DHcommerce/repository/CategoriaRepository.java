package br.dh.ecommerce.DHcommerce.repository;

import br.dh.ecommerce.DHcommerce.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}