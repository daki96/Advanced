package one.product;

public class Product {

    public static final double TAX_PERCENTAGE = 17;

    private String serialNumber;
    private double netprice;

    public Product(String serialNumber, double netprice) {
        this.serialNumber = serialNumber;
        this.netprice = netprice;
    }

    public double getNetprice() {
        return netprice;
    }

    public void setNetprice(double netprice) {
        this.netprice = netprice;
    }
    // Prvi nacin
    public double calculateGrossPrice (){
        double grossPrice = netprice + TAX_PERCENTAGE/100*netprice;
        return grossPrice;
    }

   // Drugi nacin  -
    // u ovoj metodi povezujemo neto cijenu sa cijenom poreza iz metode taxAmount ispod
    public double calculateGrossPrice1 (){
        double taxAmount = taxAmount();
        double grossPrice1 = netprice + taxAmount;
        return grossPrice1;
    }

    // Ovo je samo vrijednost poreza i nju cemo povezati uz pomoc metode iznad calculateGrossPrice1
    //100 * 17 / 100
    public double taxAmount (){
        double taxAmount = netprice*TAX_PERCENTAGE/100;
        return taxAmount;

    }
    public double taxAmount (double taxPercentage){
        double taxAmount = netprice * taxPercentage / 100;
        return taxAmount;
    }
    // treca metoda preko koje mozemo ovo izvesti overloading
    public double taxAmount (String taxPercentage){
        double percentage = Double.parseDouble(taxPercentage);
        double taxAmount = netprice * percentage/100;
        return taxAmount;
    }

    @Override
    public String toString() {
        return  serialNumber + " " + "cijena je " + calculateGrossPrice() ;
    }

    // Metoda za ispisivanje
    public void print (){
        StringBuilder sb = new StringBuilder();
        sb.append("Product serial number: " + serialNumber);
        sb.append(" net price: " + netprice);
        sb.append(" Gross price: " + calculateGrossPrice());
        System.out.println(sb.toString());

    }
}
