package com.example.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.ProductEntity;
import com.example.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class ProductApicontroller {
@Autowired
ProductRepo productRepo;

@GetMapping("/product")
public List<ProductEntity> getMethodName() {
    return productRepo.findAll();
}


@PostMapping("/product")
public ProductEntity savedata(@RequestBody ProductEntity entities) {
    //TODO: process POST request
    return productRepo.save(entities);
}

    
}
