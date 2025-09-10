package project;

import java.util.*;

public class Purchase {
    private String purchaseId;
    private String customerName;
    private List<String> productList;
    private double billAmount;
    private Date purchaseDate;

    public Purchase(String purchaseId, String customerName, List<String> productList, double billAmount, Date purchaseDate) {
        this.purchaseId = purchaseId;
        this.customerName = customerName;
        this.productList = new ArrayList<>(productList);
        this.billAmount = billAmount;
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseId() { return purchaseId; }
    public String getCustomerName() { return customerName; }
    public List<String> getProductList() { return Collections.unmodifiableList(productList); }
    public double getBillAmount() { return billAmount; }
    public Date getPurchaseDate() { return purchaseDate; }

    public void showDetails() {
        System.out.println("\nPurchase Details:");
        System.out.println("Purchase ID: " + purchaseId);
        System.out.println("Customer: " + customerName);
        System.out.println("Products: " + productList);
        System.out.println("Total Bill: " + billAmount);
        System.out.println("Date: " + purchaseDate);
    }
}

