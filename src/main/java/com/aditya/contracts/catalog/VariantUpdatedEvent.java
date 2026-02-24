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

    private UUID id;

    private String name;
    private BigDecimal priceOverride;

    private Long version;
}