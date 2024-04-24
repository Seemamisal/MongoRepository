package com.MongoSpring.MongoSpring.Service;


import com.MongoSpring.MongoSpring.Model.Product;
import com.MongoSpring.MongoSpring.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(String id, Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    public List<Product> searchProducts(String name, List<String> categories, List<String> attributes) {
        // Implement search logic based on name, categories, and attributes
        // Example: productRepository.findByNameAndCategoriesAndAttributes(name, categories, attributes);
        return null;
    }
}