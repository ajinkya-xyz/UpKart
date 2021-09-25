package xyz.ajinkya.UpKart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import xyz.ajinkya.UpKart.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select * from Product where  ")
    public Product findBySomeCriteria();
}
