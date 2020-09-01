package carLoan;

import org.testng.annotations.Test;

public class FinanceACar {


    @Test(groups ={"Smoke Testing"})
    public void Individual_Finance_Test(){
        System.out.println("This is an individual car finance ");
    }
    @Test
    public void Joint_Finance_Test(){
        System.out.println("This is an Joint car finance ");
    }
}
