package com.example.adminservice.mapper;

import com.example.adminservice.dto.ProductDTO;
import com.example.adminservice.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {



    ProductDTO toDTO(Product product);


    Product toEntity(ProductDTO productDTO);

    List<ProductDTO> toDTOList(List<Product> productList);
}