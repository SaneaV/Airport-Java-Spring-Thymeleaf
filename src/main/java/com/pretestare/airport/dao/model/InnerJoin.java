package com.pretestare.airport.dao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InnerJoin {
    private String destination;
    private Long totalSum;
    private String passengers;
}
