package com.example.wallet.service;

import com.example.wallet.repo.WalletRepo;
import com.example.wallet.rest.dto.BalanceResponse;
import com.example.wallet.rest.dto.OperationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {
    private final WalletRepo repo;

    @Override
    @Transactional
    public void topBalance(OperationRequest operationRequest) {

    }

    @Override
    @Transactional
    public BalanceResponse getBalance(UUID walletId) {
        var wallet = repo.findById(walletId).orElseThrow();
        return new BalanceResponse()
                .setWalletId(wallet.getId())
                .setBalance(wallet.getBalance());
    }
}
