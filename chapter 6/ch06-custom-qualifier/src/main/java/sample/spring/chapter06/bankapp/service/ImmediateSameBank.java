package sample.spring.chapter06.bankapp.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import sample.spring.chapter06.bankapp.annotation.BankType;
import sample.spring.chapter06.bankapp.annotation.FundTransfer;
import sample.spring.chapter06.bankapp.annotation.TransferSpeed;
import sample.spring.chapter06.bankapp.domain.Account;

@FundTransfer(transferSpeed = TransferSpeed.IMMEDIATE, bankType=BankType.SAME)
@Service
public class ImmediateSameBank implements FundTransferService {
	private static Logger logger = Logger.getLogger(ImmediateSameBank.class);
	
	@Override
	public void transferFunds(Account sender, Account receiver) {
		logger.info("ImmediateSameBank --> Transfering funds");
	}
}
