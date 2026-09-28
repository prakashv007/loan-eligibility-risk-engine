class LoanDecision
{
 private Applicant applicant;
private boolean approved;
private double eligibleAmount;
private int riskScore;
private String remarks;

LoanDecision(Applicant applicant,
boolean approved,
double eligibleAmount,
int riskScore,
String remarks)
{
this.applicant=applicant;
this.approved=approved;
this.eligibleAmount=eligibleAmount;
this.riskScore=riskScore;
this.remarks= remarks;
}

Applicant getApplicant()
 { return applicant; }
boolean isApproved()
{ return approved; }
double getEligibleAmount() 
{ return eligibleAmount; }
int getRiskScore() 
{ return riskScore; }
String getRemarks() 
{ return remarks; }
}