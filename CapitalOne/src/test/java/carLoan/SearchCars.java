package carLoan;

import org.testng.annotations.Test;

public class SearchCars {




    @Test(groups ={"Smoke Testing"})
    public void search_Used_Cars_Test(){
        System.out.println("List of used cars");
    }
    @Test
    public void search_New_Cars_Test(){
        System.out.println("List of new cars");
    }
    @Test
    public void search_Used_And_New_Cars_Test(){
        System.out.println("List of used and new cars");
    }
    @Test
    public void used_And_New_Cars_Models_Test(){
        System.out.println("List of used and new cars models");
    }
}
