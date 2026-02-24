package com.aditya.contracts.catalog;


import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VariantCreatedEvent {

    private UUID id;
    private UUID itemId;

    private String name;
    private BigDecimal priceOverride;
}