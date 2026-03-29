package com.aditya.contracts.catalog;


import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VariantUpdatedEvent {

    private UUID variantId;
    private UUID itemId;
    private UUID restaurantId;

    private String name;
    private BigDecimal price;

    private Boolean isDefault;

    private Long version;
}