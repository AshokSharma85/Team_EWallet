package com.cg.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.cg.entity.Transaction;


@Repository
public interface WalletDaoI {

	@SuppressWarnings("rawtypes")
	public List retrieveTransaction(Long loggedInIdForTransactionHistory);
	public void addTransaction(Transaction transaction,double walletBalanceOfWallet);
	
}

