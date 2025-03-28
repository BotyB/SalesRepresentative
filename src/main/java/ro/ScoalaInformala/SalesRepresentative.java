package ro.ScoalaInformala;

public class SalesRepresentative {
    private final String name;
    private final int numberOfSales;
    private final double quotaPerSale;
    private final double revenue;
    //Constructor
    public SalesRepresentative(String name, int numberOfSales, double quotaPerSale) {
        this.quotaPerSale = quotaPerSale;
        this.numberOfSales = numberOfSales;
        this.name = name;
        this.revenue = numberOfSales * quotaPerSale;
    }
    //Getters
    public String getName() {
        return name;
    }
    //Name,Number,Quota not used in current sorting method
    public int getNumberOfSales() {
        return numberOfSales;
    }

    public double getQuotaPerSale() {
        return quotaPerSale;
    }

    public double getRevenue() {
        return revenue;
    }
    @Override
    public String toString() {
        return String.format("%s: %d sales with quota $%.2f (Revenue: S%.2f)" ,
                name, numberOfSales, quotaPerSale, revenue);
    }
}
