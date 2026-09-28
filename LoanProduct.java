class LoanProduct
{
    private String productName;
    private double interestRatePercent; 
    private int tenureMonths;
    private double maxEligibleMultiplierOfIncome;

    LoanProduct(String productName,
    double interestRatePercent,
    int tenureMonths,
    double maxEligibleMultiplierOfIncome)
    {
        this.productName = productName;
        this.interestRatePercent=interestRatePercent;
        this.tenureMonths =tenureMonths;
        this.maxEligibleMultiplierOfIncome = maxEligibleMultiplierOfIncome;
    }

    String getProductName()
    {
        return productName;
    }

    double getInterestRatePercent()
    {
        return interestRatePercent;
    }

    int getTenureMonths()
    {
        return tenureMonths;
    }

    double getMaxEligibleMultiplierOfIncome()
    {
        return maxEligibleMultiplierOfIncome;
    }
    




}