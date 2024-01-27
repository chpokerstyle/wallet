package com.example.wallet.rest.controller;

import com.example.wallet.rest.dto.BalanceResponse;
import com.example.wallet.rest.dto.OperationRequest;
import com.example.wallet.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@RequiredArgsConstructor
public class WalletControllerApiImpl implements WalletControllerApi {
    private final WalletService service;

    @Override
    public ResponseEntity<Void> topBalance(OperationRequest operationRequest) {
        service.topBalance(operationRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BalanceResponse> getBalance(UUID walletId) {
        return new ResponseEntity<>(service.getBalance(walletId), HttpStatus.OK);
    }
}
