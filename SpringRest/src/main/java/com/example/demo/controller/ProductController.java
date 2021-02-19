package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.entities.Purchase_History;
import com.example.demo.service.ProductService;
import com.example.demo.service.PurchaseHistoryService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
//@RequestMapping("api/product")
public class ProductController {
	@Autowired
	private PurchaseHistoryService purchasehistoryService;
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/findProduct", method = RequestMethod.GET)
	public void findProductGet() {
	}

	@RequestMapping(value = "/findProduct", method = RequestMethod.POST, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE }, headers = "Accept=application/json")
	public ResponseEntity<Optional<Product>> findProductPost(@RequestParam("id") int id) {
//		System.out.println(productService.getProduct(id));
		try {
			return new ResponseEntity<Optional<Product>>(productService.getProduct(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Optional<Product>>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/storeProduct", method = RequestMethod.GET)
	public void storeProductGet() {
	}

	@RequestMapping(value = "/storeProduct", method = RequestMethod.POST, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE }, headers = "Accept=application/json")
	public ResponseEntity<List<Purchase_History>> storeProductPost(@RequestBody String purchaseList) {
		System.out.println(purchaseList);
		ObjectMapper mapper = new ObjectMapper();
		List<Purchase_History> ppl2 = new ArrayList<Purchase_History>();

		try {
			// 2. convert JSON array to List of objects
			ppl2 = Arrays.asList(mapper.readValue(purchaseList, Purchase_History[].class));
//            System.out.println("\nJSON array to List of objects");
//            ppl2.stream().forEach(x -> System.out.println(x));
			return new ResponseEntity<List<Purchase_History>>(purchasehistoryService.storeProduct(ppl2), HttpStatus.OK);
		} catch (IOException e) {
			return new ResponseEntity<List<Purchase_History>>(HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<List<Purchase_History>>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(value = "/findpurchasedhistory", method = RequestMethod.GET)
	public void findPurchasedHistoryGet() {
	}
	
	@RequestMapping(value = "/findpurchasedhistory", method = RequestMethod.POST, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE }, headers = "Accept=application/json")
	public ResponseEntity<List<Purchase_History>> findPurchasedHistoryPost(@RequestParam("id") int id) {
//		System.out.println(productService.getProduct(id));
		try {
			return new ResponseEntity<List<Purchase_History>>(purchasehistoryService.getPurchaseDetails(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Purchase_History>>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(value = "/updatepurchasedhistory", method = RequestMethod.GET)
	public void updatePurchasedHistoryGet() {
	}
	
	@RequestMapping(value = "/updatepurchasedhistory", method = RequestMethod.POST, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE }, headers = "Accept=application/json")
	public ResponseEntity<Purchase_History> updatePurchasedHistoryPost(@RequestBody Purchase_History purchaseHistory) {
//		System.out.println(productService.getProduct(id));
		try {
			return new ResponseEntity<Purchase_History>(purchasehistoryService.updatePurchaseDetails(purchaseHistory), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Purchase_History>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(value = "/deletepurchasedhistory", method = RequestMethod.GET)
	public void deletePurchasedHistoryGet() {
	}
	
	@RequestMapping(value = "/deletepurchasedhistory", method = RequestMethod.POST, produces = {
			MimeTypeUtils.APPLICATION_JSON_VALUE }, headers = "Accept=application/json")
	public ResponseEntity<List<Purchase_History>> deletePurchasedHistoryPost(@RequestBody Purchase_History purchaseHistory) {
		System.out.println(purchaseHistory);
		try {
			return new ResponseEntity<List<Purchase_History>>(purchasehistoryService.deleteProductFromHistory(purchaseHistory), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Purchase_History>>(HttpStatus.BAD_REQUEST);
		}
	}
}
