package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Purchase_History;

@Repository("PurchaseHistoryRepository")
public interface PurchaseHistoryRepository extends JpaRepository<Purchase_History, Integer> {
	List<Purchase_History> findBybillingId(int billing_Id);
	Purchase_History findByproductIdAndBillingId(int productId,int billingId);
//	@Modifying
//	@Query("update Customer u set u.phone = :phone where u.id = :id")
//	void updatePhone(@Param(value = "id") long id, @Param(value = "phone") String phone);
}
