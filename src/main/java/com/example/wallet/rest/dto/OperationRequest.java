package com.example.wallet.rest.dto;

import jakarta.validation.constraints.Min;
import lombok.Data;

import java.util.UUID;

@Data
public class OperationRequest {
    public enum OperationType{
        DEPOSIT, WITHDRAW;

        OperationType() {
        }
    }

    private UUID walletId;

    private OperationType operationType;

    @Min(value = 1, message = "Нельзя использовать отрицательные значения ")
    private Long amount;
}
