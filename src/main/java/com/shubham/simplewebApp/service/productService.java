package com.shubham.simplewebApp.service;

import com.shubham.simplewebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class productService {
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone15", 80000),
            new Product(102, "Canon Camera", 60000), new Product(103, "Shure Mic", 10000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductbyId(int prodId) {
        return products.stream()
                .filter(p -> p.getProdID() == prodId)
                .findFirst().orElse(new Product(0, "Item Not Found", 0));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public int findInd(int prodID){
        int start = 0;
        int end = products.size() - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (products.get(mid).getProdID() == prodID) {
                index = mid;
                break;
            } else if (products.get(mid).getProdID() < prodID) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public void updateProduct(Product prod) {
            int index=findInd(prod.getProdID());
            if(index != -1)
                products.set(index, prod);
    }

    public void deleteProduct(int prodID) {
        int index=findInd(prodID);
        if (index != -1)
            products.remove(index);

    }
}