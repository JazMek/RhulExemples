package businesLoan;

import org.testng.annotations.Test;

public class QualificationsForBusinessLoan {


    @Test(groups ={"Smoke Testing"})
    public void smale_Business_Loan_Test(){
        System.out.println("List of qualifications for a smale business");
    }
    @Test
    public void medium_Business_Loan_Test(){
        System.out.println("List of qualifications for a medium business");
    }
    @Test(enabled = true)
//   enabled = false ==> it used to enable a test = test will not run
    public void large_Business_Loan_Test(){
        System.out.println("List of qualifications for a large business");
    }
    @Test
    public void very_Large_Business_Loan_Test(){
        System.out.println("List of qualifications for a very large business");
    }
}
