package com.javierlnc.microservices.product.service;

import com.javierlnc.microservices.product.dto.ProductRequestDTO;
import com.javierlnc.microservices.product.dto.ProductResponseDTO;
import com.javierlnc.microservices.product.model.Product;
import com.javierlnc.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponseDTO createProduct(ProductRequestDTO productRequest) {
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        productRepository.save(product);
        return convertProductToDTO(product);
    }

    public List<ProductResponseDTO> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(this::convertProductToDTO)
                .toList();
    }

    private ProductResponseDTO convertProductToDTO(Product product) {
        ProductResponseDTO dto = new ProductResponseDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        return dto;
    }
}
