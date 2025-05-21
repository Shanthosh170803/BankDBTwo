package model;
import annotations.FixedFieldAnnotations;

import java.math.BigDecimal;

public record AccountDetails (
    @FixedFieldAnnotations(length = 5,format="\\d{5}")
     String customerId,
    @FixedFieldAnnotations(length = 20 , pattern="^[A-Za-z]+$")
     String customerName,
    @FixedFieldAnnotations(length = 11,format = "\\d{11}")
     String accountNumber,
    @FixedFieldAnnotations(length = 10,allowedValues = "Savings,Current")
     String accountType,
    @FixedFieldAnnotations(length = 12,format = "\\d{1,9}\\.\\d{2}")
    BigDecimal currentBalance
){}