package com.example.springmysql.dao;

import com.example.springmysql.Entite.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
