package com.aditya.contracts.catalog;


import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantIndexedEvent {

    private String eventType;   // UPSERT / DELETE
    private String entityType;  // RESTAURANT

    private Restaurant restaurant;

    private List<MenuCategory> categories;
    private List<MenuItem> items;
    private List<ItemVariant> variants;
    private List<AddonGroup> addonGroups;
    private List<AddonItem> addonItems;
}