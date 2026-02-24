package com.aditya.contracts.catalog;



import lombok.*;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class RestaurantDeletedEvent {

    private UUID restaurantId;

}
