package com.momo.SWP_SpringInt;


public interface PaymentCreator {
	Payment createPayment(Invoice invoice) throws PaymentException;
}
