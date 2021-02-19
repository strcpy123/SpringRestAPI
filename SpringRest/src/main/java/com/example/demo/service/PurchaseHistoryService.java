package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Purchase_History;

public interface PurchaseHistoryService {

	public List<Purchase_History> storeProduct(List<Purchase_History> purchaseHistory);

	public List<Purchase_History> getPurchaseDetails(int id);

	public Purchase_History getPurchaseHistoryOfOneItem(int productId, int billingId);

	public Purchase_History updatePurchaseDetails(Purchase_History purchaseHistory);

	public List<Purchase_History> deleteProductFromHistory(Purchase_History purchaseHistory);
}
