package com.defold.iap;

public interface IListProductsListener {
	public void onProductsResult(int resultCode, String productList, int billingCode, String billingMsg, long cmdHandle);
}
