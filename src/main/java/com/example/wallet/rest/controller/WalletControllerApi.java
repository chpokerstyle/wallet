package com.example.wallet.rest.controller;

import com.example.wallet.rest.dto.BalanceResponse;
import com.example.wallet.rest.dto.OperationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("v1/wallet/")
public interface WalletControllerApi {

    @PostMapping
    ResponseEntity<Void> topBalance(@RequestBody OperationRequest operationRequest);

    @GetMapping("/{walletId}")
    ResponseEntity<BalanceResponse> getBalance(@PathVariable UUID walletId);
}
