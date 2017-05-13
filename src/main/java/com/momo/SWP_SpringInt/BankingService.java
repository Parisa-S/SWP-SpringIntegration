package com.momo.SWP_SpringInt;

public interface BankingService {
	void pay(Payment payment) throws PaymentException;
}
