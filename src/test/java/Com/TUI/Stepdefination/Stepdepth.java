package Com.TUI.Stepdefination;

import Com.TUI.Pages.Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.junit.Assert;
import java.util.logging.FileHandler;



public class Stepdepth {
    Page page =new Page();
    static Logger logger = Logger.getLogger(Stepdepth.class);
    FileHandler fh;

    @Given("^User is on TUI Group website and Validate User is on Right webpage\\.$")
    public void user_is_on_TUI_Group_website_and_Validate_User_is_on_Right_webpage() throws Throwable {
        String actual=page.baseURL();
        Assert.assertTrue(actual.contains(".tuigroup.com/en-en"));
        Appender fh = null;
            fh = new FileAppender(new SimpleLayout(), "MyLogFile.log");
            logger.addAppender(fh);
            fh.setLayout(new SimpleLayout());
            logger.info("Validate User is on Right TUI Group Website");
    }
    @When("^User click on cookies and accept it\\.$")
    public void user_click_on_cookies_and_accept_it() throws Throwable {
        page.acceptCookie();
        logger.info("Website cookies are accepted");
    }
    @When("^User click on About Us link on TUI Group webpage and Select \"([^\"]*)\"\\.$")
    public void user_click_on_About_Us_link_on_TUI_Group_webpage_and_Select(String arg1) throws Throwable {
        page.aboutTUI();
        logger.info("Go to About TUI Group link via About us header");
    }
    @When("^User is now on About TUI Group webpage and then click on \"([^\"]*)\"\\.$")
    public void user_is_now_on_About_TUI_Group_webpage_and_then_click_on(String arg1) throws Throwable {
        page.managementTeam();
        logger.info("Click on Management via About TUI Group link ");
    }
    @When("^User Print Executive Board Member name \"([^\"]*)\" and Validate his Position in TUI Group\\.$")
    public void user_Print_Executive_Board_Member_name_and_Validate_his_Position_in_TUI_Group(String arg1) throws Throwable {
        page.name();
        logger.info("Print one Board member name and Validate his job Role");
    }
    @When("^User print How many Executive Board Members are on TUI Group Website\\.$")
    public void user_print_How_many_Executive_Board_Members_are_on_TUI_Group_Website() throws Throwable {
        page.setBoardmembers();
        logger.info("Print total number of Board members ");
    }
    @When("^User click on Responsibility link on TUI Group webpage and select \"([^\"]*)\"$")
    public void user_click_on_Reponsibility_link_on_TUI_Group_webpage_and_select(String arg1) throws Throwable {
        page.reportinglink();
        logger.info("Go to Reporting and Download via Responsibility Header");
    }
    @When("^User click on (\\d+) box\\.$")
    public void user_click_on_box(int arg1) throws Throwable {
       page.setYearbox();
       logger.info("Click on year box");
    }
    @Then("^User can see the respective result\\.$")
    public void user_can_see_the_respective_result() throws Throwable {

    }
}
