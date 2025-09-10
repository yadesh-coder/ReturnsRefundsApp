package project;
import java.util.*;

public class Reimbursement {
    protected String reimbursementId;
    protected String caseId;
    protected String method;
    protected double amount;
    protected Date processedDate;

    public Reimbursement(String reimbursementId, String caseId, String method, double amount) {
        this.reimbursementId = reimbursementId;
        this.caseId = caseId;
        this.method = method;
        this.amount = amount;
    }

    public String getReimbursementId() { return reimbursementId; }
    public String getCaseId() { return caseId; }
    public String getMethod() { return method; }
    public double getAmount() { return amount; }
    public Date getProcessedDate() { return processedDate; }

    public void process() {
        processedDate = new Date();
        System.out.println("Reimbursement " + reimbursementId + " of Rs." + amount + " processed via " + method);
    }
}
