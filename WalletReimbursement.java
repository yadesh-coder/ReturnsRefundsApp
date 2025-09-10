package project;

import java.util.*;

public class WalletReimbursement extends Reimbursement {
    public WalletReimbursement(String reimbursementId, String caseId, double amount) {
        super(reimbursementId, caseId, "Wallet", amount);
    }

    @Override
    public void process() {
        processedDate = new Date();
        System.out.println("Wallet Reimbursement Rs." + amount + " credited instantly [ID: " + reimbursementId + "]");
    }
}
