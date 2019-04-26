package com.example.springmysql.service;

import com.example.springmysql.Entite.Product;
import com.example.springmysql.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll()
    {
        return productRepository.findAll();   }

        public void save(Product product)
        {
            productRepository.save(product);
        }


    public Product get(Long id) {
        return  productRepository.findById(id).get();
    }

    public void delete(Long id)
    {
        productRepository.deleteById(id);
    }

    public void update(Long id, Product product)
    {


    }

}
