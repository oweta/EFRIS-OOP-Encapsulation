import java.time.LocalDateTime;

public class TransactionRecord {
    // Private fields
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private LocalDateTime timestamp;

    // Constructor
    public TransactionRecord(String buyerTIN, String sellerTIN, double invoiceAmount) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = invoiceAmount;
        this.timestamp = LocalDateTime.now(); // record the transaction time
    }

    // Public getters and setters
    public String getBuyerTIN() {
        return buyerTIN;
    }

    public void setBuyerTIN(String buyerTIN) {
        this.buyerTIN = buyerTIN;
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    public void setSellerTIN(String sellerTIN) {
        this.sellerTIN = sellerTIN;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
