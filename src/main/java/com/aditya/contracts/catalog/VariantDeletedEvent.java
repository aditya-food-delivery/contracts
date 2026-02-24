package com.aditya.contracts.catalog;



import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VariantDeletedEvent {

    private UUID id;

}