package com.example.adminservice.mapper;

import antlr.collections.List;
import com.example.adminservice.dto.ProductDTO;
import com.example.adminservice.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMap {
    //source bu  dtodigi nomi target bu entitydigi nomi
    ProductDTO toDTO(Product product);

    //source bu  entitydigi nomi target bu dtodigi nomi
    Product toEntity(ProductDTO productDTO);

    List<ProductDTO> toDTOList(List<Product> productList);
}
