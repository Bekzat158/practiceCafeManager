package com.example.CafeManagement.service;

import com.example.CafeManagement.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ProductService {
    ResponseEntity<String> addProduct(Map<String, String> requestMap);
    ResponseEntity<List<ProductWrapper>> getAllProduct();
    ResponseEntity<String> updateProduct(Map<String, String> requestMap);
    ResponseEntity<String> deleteProduct(Integer id);
    ResponseEntity<String> updateProductStatus(Map<String, String> requestMap);
    ResponseEntity<List<ProductWrapper>> getProductByCategory(Integer id);
    ResponseEntity<ProductWrapper> getProductById(Integer id);
}
