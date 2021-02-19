package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Purchase_History;
import com.example.demo.repositories.PurchaseHistoryRepository;

@Service("purchaseHistoryService")
public class PurchaseHistoryServiceImpl implements PurchaseHistoryService {

	// Reference declaration
	private Purchase_History purchaseHistoryofOneItem;
	private List<Purchase_History> purchaseList;
	@Autowired
	private PurchaseHistoryRepository purchaseHistoryRepository;

	/**
	 * Insert data in the Purchase_History table
	 * 
	 * @param purchaseHistory
	 */
	@Override
	public List<Purchase_History> storeProduct(List<Purchase_History> purchaseHistory) {
		System.out.println(purchaseHistory);
		purchaseHistoryRepository.saveAll(purchaseHistory);
		List<Purchase_History> obj = purchaseHistoryRepository.findBybillingId(purchaseHistory.get(0).getBillingId());
		return obj;
	}

	/**
	 * Get data from Purchase_History table on the basis of id
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public List<Purchase_History> getPurchaseDetails(int id) {
//		System.out.println(id);
		purchaseList = new ArrayList<Purchase_History>();
		List<Purchase_History> obj = purchaseHistoryRepository.findBybillingId(id);
		return obj;
	}

	/**
	 * Get one item from Purchase_History table on the basis of productId
	 * 
	 * @param productId
	 * @return
	 */
	@Override
	public Purchase_History getPurchaseHistoryOfOneItem(int productId, int billingId) {
		purchaseHistoryofOneItem = new Purchase_History();
		System.out.println("DB Quanity:" + purchaseHistoryofOneItem.getQuantity());
		System.out.println("DB TotalCost:" + purchaseHistoryofOneItem.getTotal_cost());
		return purchaseHistoryofOneItem;
	}

	/**
	 * Update Purchase_History table
	 * 
	 * @param quantity
	 * @param totalCost
	 * @param productId
	 * @param billingId
	 * @return
	 */
	@Override
	public Purchase_History updatePurchaseDetails(Purchase_History purchaseHistory) {
		purchaseHistoryRepository.save(purchaseHistory);
//		purchaseHistoryRepository.find
		return purchaseHistoryRepository.findByproductIdAndBillingId(purchaseHistory.getProductId(),
				purchaseHistory.getBillingId());
	}

	/**
	 * Delete selected product from the table Purchase_History
	 * 
	 * @param productId
	 * @param billingId
	 * @return
	 */
	@Override
	public List<Purchase_History> deleteProductFromHistory(Purchase_History purchaseHistory) {
//		System.out.println(purchaseHistory);
		purchaseHistoryRepository.delete(purchaseHistory);
		return purchaseHistoryRepository.findBybillingId(purchaseHistory.getBillingId());
	}

}
