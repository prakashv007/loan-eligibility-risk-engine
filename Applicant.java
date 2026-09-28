class Applicant
{
   private String name;
   private int age;
   private double monthlyIncome;
   private int existingLoansCount;
   private double existingEMIAmount;
   private int creditScore;
   private String employmentType;

    Applicant(String name,
    int age,
    double monthlyIncome,
    int existingLoansCount,
    double existingEMIAmount,
    int creditScore,
    String employmentType)
    {
         this.name =name ;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.existingLoansCount = existingLoansCount;
        this.existingEMIAmount = existingEMIAmount;
        this.creditScore =creditScore;
        this.employmentType = employmentType;
    }

    String getName(){
        return name;
    }
    String getEmploymentType(){
        return employmentType;
    }
    int getAge(){
        return age;
    }
    int getExistingLoansCount(){
        return existingLoansCount ;
    }
    int getCreditScore()
    {
        return creditScore;
    }
    double getMonthlyIncome()
    {
        return monthlyIncome;
    }
    double getExistingEMIAmount()
    {
        return existingEMIAmount;
    }

    public String toString()
    {
        return name + " | Age: " + age + " | Income: " + monthlyIncome +" | Existing Loans:" + existingLoansCount+" | Existing EMI Amount:"+existingEMIAmount+" | CreditScore "+creditScore+" | Employeement Type" +employmentType ;
    }




}