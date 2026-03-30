package com.aditya.contracts.catalog;


import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategory {

    private UUID categoryId;
    private UUID restaurantId;

    private String name;
    private Integer displayOrder;
    private boolean deleted;
}