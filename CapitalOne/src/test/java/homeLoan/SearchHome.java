package homeLoan;

import org.testng.annotations.Test;

public class SearchHome {


    @Test(groups ={"Smoke Testing"})
    public void search_Old_Homes_Test(){
        System.out.println("List of used Homes");
    }
    @Test
    public void search_New_Homes_Test(){
        System.out.println("List of new Homes");
    }
    @Test
    public void search_Old_And_New_Homes_Test(){
        System.out.println("List of Old and new Homes");
    }
}
