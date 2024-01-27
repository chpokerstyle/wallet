package com.example.wallet.service;

import com.example.wallet.rest.dto.BalanceResponse;
import com.example.wallet.rest.dto.OperationRequest;

import java.util.UUID;

public interface WalletService {

    void topBalance(OperationRequest operationRequest);

    BalanceResponse getBalance(UUID walletId);
}
