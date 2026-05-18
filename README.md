# 🛒 ReturnsRefundsApp

> A console-based Java application that simulates a real-world **Returns & Refunds workflow** in e-commerce — built to demonstrate core Object-Oriented Programming (OOP) principles.

---

## 📖 About

**ReturnsRefundsApp** models the complete lifecycle of a product return and refund process, from a customer raising a return request to the final reimbursement being processed. The project is structured using clean OOP design, making it a practical reference for understanding how Java classes, inheritance, and polymorphism work together in a real-world scenario.

---

## ✨ Features

- Register customer purchases with item lists and amounts
- Create return cases with reasons and product conditions
- Inspect, approve, or reject return cases
- Process reimbursements via **Bank** or **Wallet** payment methods
- Display a complete daily return & refund summary on the console
- Supports optional photo evidence during case creation (method overloading)

---

## 🏗️ Project Structure

```
ReturnsRefundsApp/
│
├── ReturnApp.java            # Entry point — runs the demo workflow
├── Purchase.java             # Represents a customer's purchase
├── ReturnCase.java           # Represents a return request with status tracking
├── ReturnManager.java        # Core controller — manages purchases, cases & reimbursements
├── Reimbursement.java        # Abstract base class for reimbursement types
├── BankReimbursement.java    # Concrete class — handles bank refunds
└── WalletReimbursement.java  # Concrete class — handles wallet refunds
```

---

## 🔄 Workflow

```
Customer Purchase  →  Create Return Case  →  Inspect  →  Approve / Reject
                                                              ↓
                                                    Process Reimbursement
                                                    (Bank or Wallet)
                                                              ↓
                                                      Show Daily Summary
```

---

## 🧠 OOP Concepts Demonstrated

| Concept | Where It's Applied |
|---|---|
| **Encapsulation** | All fields in `Purchase`, `ReturnCase`, `Reimbursement` are private with getters/setters |
| **Inheritance** | `BankReimbursement` and `WalletReimbursement` extend the abstract `Reimbursement` class |
| **Polymorphism** | `ReturnManager` processes any `Reimbursement` subtype through a common reference |
| **Method Overloading** | `createCase()` has two versions — with and without a photo parameter |
| **Method Overriding** | Subclasses override the `process()` method from `Reimbursement` |

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or the command line

### Run the App

**1. Clone the repository**
```bash
git clone https://github.com/yadesh-coder/ReturnsRefundsApp.git
cd ReturnsRefundsApp
```

**2. Compile all files**
```bash
javac -d . *.java
```

**3. Run the application**
```bash
java project.ReturnApp
```

### Expected Output

```
Inspecting return case C001, Condition: Damaged
Case C001 approved.
Processing Bank Reimbursement of ₹2000.0 for Case C001

===== DAILY RETURN SUMMARY =====
Return Cases:

Return Case Details:
Case ID: C001
Purchase ID: P001
Reason: Defective product
Condition: Damaged
Status: REFUNDED

Reimbursements:
ID: RB001, Amount: 2000.0, Method: Bank, Date: <timestamp>
```

---

## 📦 Class Overview

### `Purchase`
Holds details of a customer purchase — ID, customer name, list of items, total amount, and purchase date.

### `ReturnCase`
Tracks a return request. Status transitions: `PENDING → APPROVED / REJECTED → REFUNDED`.

### `ReturnManager`
The central controller. Manages all purchases, return cases, and reimbursements. Exposes methods to create cases, inspect, approve, reject, process reimbursements, and print a summary.

### `Reimbursement` *(Abstract)*
Base class defining the contract for all reimbursement types — holds the reimbursement ID, case ID, amount, method, and processed date.

### `BankReimbursement` & `WalletReimbursement`
Concrete subclasses that override `process()` to handle bank transfers and wallet credits respectively.

---

## 🛠️ Tech Stack

- **Language:** Java
- **Paradigm:** Object-Oriented Programming (OOP)
- **Type:** Console Application
- **Package:** `project`

---

## 👨‍💻 Author

**Yadesh**  
[@yadesh-coder](https://github.com/yadesh-coder)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
