package com.example.springmysql;

import com.example.springmysql.Entite.Product;
import com.example.springmysql.dao.ProductRepository;
import com.example.springmysql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmysqlApplication implements CommandLineRunner  {

    public static void main(String[] args) {
        SpringApplication.run(SpringmysqlApplication.class, args);
    }
   @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductService productService;
    @Override
    public void run(String... args) throws Exception {
//        productService.save(new Product(null,"fleury","fleury","fleury",1250.6f));
//        productService.save(new Product(null,"fleury","fleury","fleury",1250.6f));
//        productService.save(new Product(null,"fleury","fleury","fleury",1250.6f));

    }
}
