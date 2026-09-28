import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of applicants: ");
        int count = Integer.parseInt(sc.nextLine());

        Applicant[] applicants = new Applicant[count];
        LoanDecision[] results = new LoanDecision[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Applicant " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Monthly Income: ");
            double income = Double.parseDouble(sc.nextLine());

            System.out.print("Existing Loans Count: ");
            int loansCount = Integer.parseInt(sc.nextLine());

            System.out.print("Existing EMI Amount: ");
            double emi = Double.parseDouble(sc.nextLine());

            System.out.print("Credit Score: ");
            int creditScore = Integer.parseInt(sc.nextLine());

            System.out.print("Employment Type (SALARIED/SELF_EMPLOYED): ");
            String employmentType = sc.nextLine();

            applicants[i] = new Applicant(name, age, income, loansCount, emi, creditScore, employmentType);
        }

        LoanProduct product = new LoanProduct("Personal Loan", 12.5, 36, 20);
        RiskEngine riskEngine = new RiskEngine();
        EligibilityCalculator calculator = new EligibilityCalculator();

        for (int i = 0; i < count; i++) {
            int riskScore = riskEngine.calculateRiskScore(applicants[i]);
            results[i] = calculator.evaluate(applicants[i], product, riskScore);
        }

        System.out.println("\n=== Results ===");
        int approvedCount = 0;
        int totalRisk = 0;

        for (int i = 0; i < count; i++) {
            LoanDecision decision = results[i];
            System.out.println(decision.getApplicant().getName()
                    + " | Risk Score: " + decision.getRiskScore()
                    + " | Status: " + (decision.isApproved() ? "APPROVED" : "REJECTED")
                    + " | Eligible Amount: " + decision.getEligibleAmount()
                    + " | " + decision.getRemarks());

            if (decision.isApproved()) approvedCount++;
            totalRisk += decision.getRiskScore();
        }

        System.out.println("\nSummary: " + approvedCount + " Approved, "
                + (count - approvedCount) + " Rejected | Average Risk Score: "
                + (totalRisk / count));

        sc.close();
    }
}