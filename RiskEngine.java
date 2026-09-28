class RiskEngine{
public int calculateRiskScore(Applicant applicant) {
    int score = 100;

    if (applicant.getCreditScore() < 650) {
        return 0; // rejected
    } else {
        double dti = (applicant.getExistingEMIAmount() / applicant.getMonthlyIncome()) * 100;

        if (dti > 40) {
            return 0; // rejected
        } else {
            if (applicant.getCreditScore() < 750) {
                score = score - 15;
            }

            if (dti >= 20) {
                score = score - 10;
            }

            if (!applicant.getEmploymentType().equals("SALARIED")) {
                score = score - 10;
            }

            if (applicant.getAge() < 25 || applicant.getAge() > 55) {
                score = score - 5;
            }

            return score;
        }
    }
            }
}  