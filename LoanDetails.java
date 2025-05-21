package model;
import annotations.FixedFieldAnnotations;
import java.math.BigDecimal;
import java.time.LocalDate;

public record LoanDetails (
    @FixedFieldAnnotations(length = 5,format = "\\d{5}")
     String customerId,
    @FixedFieldAnnotations(length = 20, pattern="^[A-Za-z]+$" )
     String customerName,
    @FixedFieldAnnotations(length = 6,format = "\\d{6}")
     String loanId,
    @FixedFieldAnnotations(length = 12,format = "\\d{1,9}\\.\\d{2}")
    BigDecimal loanAmount,
    @FixedFieldAnnotations(length = 20,allowedValues = "Home Loan,Educational Loan,Business Loan,Personal Loan")
     String loanType,
    @FixedFieldAnnotations(length = 8,format = "\\d{8}")
     LocalDate approvalDate
    ){}
