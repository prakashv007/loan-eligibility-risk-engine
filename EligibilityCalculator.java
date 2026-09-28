class EligibilityCalculator {

    public LoanDecision evaluate(Applicant applicant, LoanProduct product, int riskScore) {

        if (riskScore == 0) {
            // RiskEngine already rejected this applicant (failed credit score or DTI gate)
            return new LoanDecision(applicant, false, 0.0, riskScore, "Rejected - failed credit score or DTI check");
        } else {
            double eligibleAmount = applicant.getMonthlyIncome() * product.getMaxEligibleMultiplierOfIncome();

            // If the applicant is only borderline-safe (score below 75), reduce the amount
            // to be more conservative - same idea real lenders use for marginal approvals.
            if (riskScore < 75) {
                eligibleAmount = eligibleAmount * 0.8;
            }

            return new LoanDecision(applicant, true, eligibleAmount, riskScore, "Approved");
        }
    }
}