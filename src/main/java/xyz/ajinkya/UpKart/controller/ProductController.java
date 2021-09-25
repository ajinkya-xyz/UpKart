package xyz.ajinkya.UpKart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.ajinkya.UpKart.domain.Product;
import xyz.ajinkya.UpKart.repository.ProductRepository;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findProduct(@RequestParam Long id){
        return productRepository.findById(id).get();
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
         productRepository.deleteById(id);
    }

}
