package com.giri.batchpractice.domain;

import javax.validation.constraints.Pattern;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    private Long orderId;
    private String firstName;
    private String lastName;
    @Pattern(regexp = ".*\\.gov")
    private String email;
    private BigDecimal cost;
    private String itemId;
    private String itemName;
    private LocalDateTime shipDate;
}
