package project;

import java.util.*;

public class BankReimbursement extends Reimbursement {
    public BankReimbursement(String reimbursementId, String caseId, double amount) {
        super(reimbursementId, caseId, "Bank", amount);
    }

    @Override
    public void process() {
        processedDate = new Date();
        System.out.println("Bank Reimbursement Rs." + amount + " credited [ID: " + reimbursementId + "]");
    }
}
