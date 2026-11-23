package com.defold.iap;

public interface ICountryListener {
	public void onCountryResult(int resultCode, String country, int billingCode, String billingMsg, long requestId);
}
