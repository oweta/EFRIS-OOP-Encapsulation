# TransactionRecord – Encapsulation Example for EFRIS

This Java class demonstrates **encapsulation** in a simulated URA EFRIS system.  
It protects sensitive transaction data such as:

- Buyer TIN
- Seller TIN
- Invoice Amount
- Timestamp

## 🛡️ How It Works

- All fields are marked as `private`
- Access is controlled via `public getter` and `setter` methods
- Timestamp is auto-generated using `LocalDateTime.now()`

## 🧪 Example Usage

```java
TransactionRecord record = new TransactionRecord("TIN123", "TIN999", 105000.0);
System.out.println(record.getBuyerTIN()); // prints: TIN123
