package com.aditya.contracts.catalog;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemUpdatedEvent {

    private UUID itemId;
    private UUID restaurantId;
    private UUID categoryId;

    private String name;
    private String description;
    private String imageUrl;

    private String vegFlag;

    private Boolean hasVariants;
    private Boolean hasAddons;

    private Boolean active;

    private Long version;
}