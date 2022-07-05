package com.example.adminservice.dto;

import com.example.adminservice.entity.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
    private Long id;
    private Attachment photo;
    private String nameUz, nameRu;
    private BigDecimal price;
    private String description;
    private boolean active=true;
}
