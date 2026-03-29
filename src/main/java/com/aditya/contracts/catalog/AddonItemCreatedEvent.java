package com.aditya.contracts.catalog;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Getter

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddonItemCreatedEvent {

    private UUID addonItemId;
    private UUID addonGroupId;
    private UUID itemId;
    private UUID restaurantId;

    private String name;
    private BigDecimal price;
}
