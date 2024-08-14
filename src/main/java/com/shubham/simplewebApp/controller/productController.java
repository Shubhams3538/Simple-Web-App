package com.shubham.simplewebApp.controller;

import com.shubham.simplewebApp.model.Product;
import com.shubham.simplewebApp.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class productController {

    @Autowired
    productService service;

    @GetMapping("/products")
    public List<Product> getproducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductbyId(@PathVariable int prodId){
        return service.getProductbyId(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodID}")
    public void deleteProduct(@PathVariable int prodID){
        service.deleteProduct(prodID);
    }

}

