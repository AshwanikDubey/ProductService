package com.fake.store.controller;

import com.fake.store.dto.Productdto;
import com.fake.store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/products")
public class product {
    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<Productdto> getProductById(@PathVariable("id") Long id){
        return ResponseEntity.ok(productService.getProductById(id)) ;
    }

}
