package com.javierlnc.microservices.product.controller;

import com.javierlnc.microservices.product.dto.ProductRequestDTO;
import com.javierlnc.microservices.product.dto.ProductResponseDTO;
import com.javierlnc.microservices.product.model.Product;
import com.javierlnc.microservices.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseDTO createProduct (@RequestBody ProductRequestDTO productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping
    public List<ProductResponseDTO> getAllProducts(){
        return  productService.getAllProducts();
    }

}
