package model;
import annotations.FixedFieldAnnotations;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionDetails (

    @FixedFieldAnnotations(length = 5,format = "\\d{5}")
    String customerId,
    @FixedFieldAnnotations(length = 20 , pattern="^[A-Za-z]+$")
    String customerName,
    @FixedFieldAnnotations(length = 6,format = "\\d{6}")
    String transactionId,
    @FixedFieldAnnotations(length = 11,format = "\\d{11}")
    String accountNumber,
    @FixedFieldAnnotations(length = 30,allowedValues = "UPI,mobile wallets,digital cards,NEFT,RTGS,IMPS,Cheque,Direct Deposit,ATM Transactions")
    String transactionType,
    @FixedFieldAnnotations(length = 12,format = "\\d{1,9}\\.\\d{2}")
    BigDecimal transactionAmount,
    @FixedFieldAnnotations(length = 18,format = "\\d{2}\\d{2}\\d{4} \\d{2}:\\d{2}:\\d{1,2}")
    LocalDateTime transactionDateTime
){}
