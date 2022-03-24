package one.product;

public class Wine extends Product{

    public static final double ADDITIONAL_TAX = 10.0 ;
    public Wine(String serialNumber, double netprice) {
        super(serialNumber, netprice);
    }

    @Override
    public double calculateGrossPrice() {
        double taxPercentage = ADDITIONAL_TAX + TAX_PERCENTAGE;
        double netPrice = getNetprice();
        double taxAmount = taxAmount(taxPercentage);
        double totalGross = netPrice + taxAmount;
        return totalGross;
    }

    @Override
    public double calculateGrossPrice1() {
        return taxAmount(TAX_PERCENTAGE);
    }
}
