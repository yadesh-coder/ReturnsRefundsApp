package project;

import java.util.*;

public class ReturnApp {
    public static void main(String[] args) {
        ReturnManager manager = new ReturnManager();

        Purchase p1 = new Purchase("P001", "Ravi", Arrays.asList("Watch", "Wallet"), 2000.0, new Date());
        manager.addPurchase(p1);

        ReturnCase rc1 = manager.createCase("C001", "P001", "Defective product", "Damaged");
        manager.inspect("C001");
        manager.approve("C001");

        manager.processReimbursement("RB001", "C001", 2000.0, "Bank");

        manager.showSummary();
    }
}
