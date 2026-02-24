package com.aditya.contracts.catalog;





import lombok.*;

import java.util.UUID;

@Getter

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryDeletedEvent {
    private UUID id;

}