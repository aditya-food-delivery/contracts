package com.aditya.contracts.catalog;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddonGroupCreatedEvent {

    private UUID addonGroupId;
    private UUID itemId;
    private UUID restaurantId;

    private String name;
    private Integer minSelection;
    private Integer maxSelection;
    private Boolean required;
}