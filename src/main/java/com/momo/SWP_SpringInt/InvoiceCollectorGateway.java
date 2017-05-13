package com.momo.SWP_SpringInt;

import java.util.Collection;

public interface InvoiceCollectorGateway {
	void collectInvoices(Collection<Invoice> invoices);
}
