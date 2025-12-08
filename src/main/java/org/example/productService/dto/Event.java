package org.example.productService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private String eventType;
    private Instant timestamp;
    private Object payload;
}
