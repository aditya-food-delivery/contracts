package com.aditya.contracts.catalog;


import java.math.BigDecimal;
import java.util.UUID;

public class AddonItemCreatedEvent {

    private UUID addonItemId;
    private UUID addonGroupId;
    private UUID itemId;
    private UUID restaurantId;

    private String name;
    private BigDecimal price;
}
