package com.shubham.simplewebApp.service;

import com.shubham.simplewebApp.model.Product;
import com.shubham.simplewebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class productService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone15", 80000),
//            new Product(102, "Canon Camera", 60000), new Product(103, "Shure Mic", 10000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductbyId(int prodId) {
        return repo.findById(prodId).orElse(new Product(0,"Data Not Found",0));
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
            repo.save(prod);
    }

    public void deleteProduct(int prodID) {
       repo.deleteById(prodID);
    }
}