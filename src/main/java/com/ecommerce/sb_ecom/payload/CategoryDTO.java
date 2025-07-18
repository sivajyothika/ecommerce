package com.ecommerce.sb_ecom.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    Long categoryId;
    @NotBlank
    @Size(min=5,message = "categoryName should be minimum of size 5!!!")
    String categoryName;
}
