package definitionPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;


public class Loginstepdefinition {


    @Before     //Once only before  execution of a SCENARIO frm feature file..once per SCENARIO
    public void beforessss()
    {

        System.out.println("BEFORE for all,here will be called before every sceanrio");
        System.out.println();
    }




    @After
    public void afterss()  //One time only for whole feature file..
    {

        System.out.println("AFTER for all");
        System.out.println("*****");
        System.out.println();
        System.out.println();

    }


    @Before(value = "@explicit_before_needed",order = 0)    //This will let this explicit before to be called first
    public void beforessss_2()
    {
        System.out.println("!!!!!!!!!!!!!!!");
        System.out.println("BEFORE explicit CALLED");
        System.out.println("!!!!!!!!!!!!!!!");
    }

    @Given("user is at login page")
    public void user_is_at_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();

        System.out.println("login page loaded");
        System.out.println();

    }

    @When("Title of page is MYtitle")
    public void title_of_page_is_MYtitle() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();

        System.out.println("Title is yahoo");

    }

    //@When("user Enters userName and password \"(.*)\" \"(.*)\"")

    //    "(.*)"

    @When("user Enters userName and password {string} {string}")
    public void user_Enters_userName_and_password_userName_password(String userID, String passwd) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();

        System.out.println("entered username and password" +"####"+ userID+ "***"+passwd);
    }


    @When("user Enters userName {string} and password {string}")
    public void user_Enters_userName_and_password(String string, String string2) {

        System.out.println("entered username and password" +"####"+ string+ "***"+string2);

    }

    //Commented DATA table LIST of LIST of STRING way


    /*@When("user Enters userName  and password")
    public void user_Enters_userName_and_password(DataTable dataTable) {


        List<List<String>> llist=dataTable.cells();

        System.out.println("username 1 is "+llist.get(0).get(0));
        System.out.println("username 1 password  is "+llist.get(0).get(1));
        System.out.println("username 2 is "+llist.get(1).get(0));
        System.out.println("username 2 password is "+llist.get(1).get(1));
    }
*/




    @When("user Enters userName  and password")
    public void user_Enters_userName_and_password( DataTable dataTable) {


        //List<Map<String,String>> listOfMap=dataTable.asMaps();


        for(Map<String,String> map:dataTable.asMaps())
        {

            System.out.println(map.get("Name"));
            System.out.println(map.get("Passwd"));
            System.out.println(map.get("Age"));
        }



    }

    @When("user clicks submit button")
    public void user_clicks_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();


        System.out.println();
        System.out.println("clicked submit button");
        System.out.println();
    }

    @Then("user is at homepage")
    public void user_is_at_homepage() {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
        //System.out.println("HOMEpage loaded");

        //assert true;
    }


}


