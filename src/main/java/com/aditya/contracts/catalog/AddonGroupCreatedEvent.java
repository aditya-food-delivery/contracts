package com.aditya.contracts.catalog;


import java.util.UUID;

public class AddonGroupCreatedEvent {

    private UUID addonGroupId;
    private UUID itemId;
    private UUID restaurantId;

    private String name;
    private Integer minSelection;
    private Integer maxSelection;
    private Boolean required;
}