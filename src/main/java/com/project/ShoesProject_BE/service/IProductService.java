package com.project.ShoesProject_BE.service;

import com.project.ShoesProject_BE.model.dto.ProductDTO;
import com.project.ShoesProject_BE.model.dto.ProductImageDTO;
import com.project.ShoesProject_BE.model.Product;
import com.project.ShoesProject_BE.model.ProductImage;
import com.project.ShoesProject_BE.model.response.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IProductService {
    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;
    Page<ProductResponse> getAllProducts(PageRequest pageRequest);
    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(
            Long productId,
            ProductImageDTO productImageDTO) throws Exception;
}