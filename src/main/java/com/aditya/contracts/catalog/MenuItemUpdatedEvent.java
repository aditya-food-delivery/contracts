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

    private UUID id;

    private String name;
    private String description;
    private BigDecimal price;

    private boolean vegFlag;
    private String availability;

    private Long version;
}