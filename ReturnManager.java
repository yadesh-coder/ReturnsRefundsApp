package project;

import java.util.*;

public class ReturnManager {
    private Map<String, Purchase> purchases = new HashMap<>();
    private Map<String, ReturnCase> cases = new HashMap<>();
    private List<Reimbursement> reimbursements = new ArrayList<>();

    public ReturnCase createCase(String caseId, String purchaseId, String reason, String condition) {
        ReturnCase rc = new ReturnCase(caseId, purchaseId, reason, condition);
        cases.put(caseId, rc);
        return rc;
    }

    public ReturnCase createCase(String caseId, String purchaseId, String reason, String condition, String photo) {
        System.out.println("Photo received for inspection: " + photo);
        return createCase(caseId, purchaseId, reason, condition);
    }

    public void inspect(String caseId) {
        ReturnCase rc = cases.get(caseId);
        if (rc != null) {
            System.out.println("Inspecting return case " + caseId + ", Condition: " + rc.getCondition());
        }
    }

    public void approve(String caseId) {
        ReturnCase rc = cases.get(caseId);
        if (rc != null) {
            rc.approve();
            System.out.println("Case " + caseId + " approved.");
        }
    }

    public void reject(String caseId) {
        ReturnCase rc = cases.get(caseId);
        if (rc != null) {
            rc.reject();
            System.out.println("Case " + caseId + " rejected.");
        }
    }

    public void processReimbursement(String reimbursementId, String caseId, double amount, String type) {
        ReturnCase rc = cases.get(caseId);
        if (rc != null && rc.getStatus().equals("APPROVED")) {
            Reimbursement reimb;
            if (type.equalsIgnoreCase("Bank")) {
                reimb = new BankReimbursement(reimbursementId, caseId, amount);
            } else {
                reimb = new WalletReimbursement(reimbursementId, caseId, amount);
            }
            reimb.process();
            reimbursements.add(reimb);
            rc.completeRefund();
        }
    }

    public void addPurchase(Purchase p) {
        purchases.put(p.getPurchaseId(), p);
    }

    public void showSummary() {
        System.out.println("\n===== DAILY RETURN SUMMARY =====");
        System.out.println("Return Cases:");
        for (ReturnCase rc : cases.values()) {
            rc.showDetails();
        }
        System.out.println("\nReimbursements:");
        for (Reimbursement r : reimbursements) {
            System.out.println("ID: " + r.getReimbursementId() + ", Amount: " + r.getAmount() +
                    ", Method: " + r.getMethod() + ", Date: " + r.getProcessedDate());
        }
    }
}

