package model;

import annotations.FixedFieldAnnotations;

import java.time.LocalDate;

public record CustomerDetails(
    @FixedFieldAnnotations(length = 5,format = "\\d{5}")
     String customerId,
    @FixedFieldAnnotations(length = 20 , pattern="^[A-Za-z]+$")
     String customerName,
    @FixedFieldAnnotations(length = 6,allowedValues = "Male,Female,Others")
     String gender,
    @FixedFieldAnnotations(length = 8,format = "\\d{8}")
    LocalDate dateOfBirth,
    @FixedFieldAnnotations(length = 10,format = "\\d{10}")
     String contactNumber,
    @FixedFieldAnnotations(length = 30,format = ".+@.+\\..+")
     String email,
    @FixedFieldAnnotations(length = 30)
     String residentialAddress
){}
