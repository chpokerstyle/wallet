package com.example.wallet.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
public class BalanceResponse {

    @JsonIgnore
    private UUID walletId;

    @JsonIgnore
    private Long balance;

    private final String message = "На счёте №_" + walletId + " " + balance + " $";
}
