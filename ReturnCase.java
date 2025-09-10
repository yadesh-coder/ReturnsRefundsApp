package project;

public class ReturnCase {
    private String caseId;
    private String purchaseId;
    private String reason;
    private String condition;
    private String status; 

    public ReturnCase(String caseId, String purchaseId, String reason, String condition) {
        this.caseId = caseId;
        this.purchaseId = purchaseId;
        this.reason = reason;
        this.condition = condition;
        this.status = "PENDING";
    }

    public String getCaseId() { return caseId; }
    public String getPurchaseId() { return purchaseId; }
    public String getReason() { return reason; }
    public String getCondition() { return condition; }
    public String getStatus() { return status; }

    public void approve() {
        if (status.equals("PENDING")) status = "APPROVED";
    }

    public void reject() {
        if (status.equals("PENDING")) status = "REJECTED";
    }

    public void completeRefund() {
        if (status.equals("APPROVED")) status = "REFUNDED";
    }

    public void showDetails() {
        System.out.println("\nReturn Case Details:");
        System.out.println("Case ID: " + caseId);
        System.out.println("Purchase ID: " + purchaseId);
        System.out.println("Reason: " + reason);
        System.out.println("Condition: " + condition);
        System.out.println("Status: " + status);
    }
}

