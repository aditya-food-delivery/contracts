package com.aditya.contracts.catalog;



import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryUpdatedEvent {

    private UUID id;
    private String name;
    private Integer displayOrder;
    private Long version;
}