package com.example.mutsamarket.dto;

import com.example.mutsamarket.entity.OfferEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OfferDto {
    private Long id;
    private Long itemId;
    private Integer suggestedPrice;
    private String writer;
    private String password;
    private String status;

    public static OfferDto fromEntity(OfferEntity offerEntity) {
        OfferDto offerDto = new OfferDto();

        offerDto.setId(offerEntity.getId());
        offerDto.setItemId(offerEntity.getItemId());
        offerDto.setSuggestedPrice(offerEntity.getSuggestedPrice());
        offerDto.setWriter(offerEntity.getWriter());
        offerDto.setPassword(offerEntity.getPassword());
        offerDto.setStatus(offerEntity.getStatus());

        return offerDto;
    }
}
