package com.aditya.contracts.catalog;



import lombok.*;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class RestaurantCreatedEvent {
    private UUID restaurantId;
    private String name;
    private String cuisineTypes;
}