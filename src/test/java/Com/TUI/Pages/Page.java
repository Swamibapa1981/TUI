package Com.TUI.Pages;

import Com.TUI.Driverfactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Page extends Driverfactory {
    public String baseURL(){

        return  driver.getCurrentUrl();
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/a")
    WebElement Cookie;
    public void acceptCookie(){

        Cookie.click();
    }
    @FindBy(xpath = "//*[@id=\"site-header\"]/header/div[2]/nav/div/ul/li[1]/a")
    WebElement Aboutus;
    @FindBy(xpath = "//*[@id=\"site-header\"]/header/div[2]/nav/div/ul/li[1]/ul/li[1]/a[2]")
    WebElement AboutTUIgroup;
    public void aboutTUI(){
        Actions action= new Actions(driver);
        action.moveToElement(Aboutus).perform();
        AboutTUIgroup.click();
    }
    @FindBy(xpath = "//*[@id=\"left-navi\"]/ul/li[1]/ul/li[1]/a")
    WebElement Management;
    public void managementTeam(){

        Management.click();
    }
    @FindBy(xpath = "//*[@id=\"content\"]/div/article/div/div/article[1]/div/a/div[2]")
    WebElement Membername;
    @FindBy(xpath = "//*[@id=\"content\"]/div/article/div/div/article[1]/div/a/div[3]/p")
    WebElement Position;
    public void name(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoview;",Membername);
        String personname=Membername.getText();
        System.out.println(personname);
        String actual=Position.getText();
        System.out.println(actual);
        Assert.assertThat(actual, Matchers.equalTo("CEO"));
    }
    @FindBy(css = ".title")
    WebElement Boardmembers;
    public void setBoardmembers(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        List<WebElement>members=driver.findElements(By.cssSelector(".title"));
        System.out.println("Number of names found:"+members.size());
    }
    @FindBy(xpath = "//*[@id=\"site-header\"]/header/div[2]/nav/div/ul/li[4]/a")
    WebElement Responsibility;
    @FindBy(xpath = "//*[@id=\"site-header\"]/header/div[2]/nav/div/ul/li[4]/ul/li[6]/a")
    WebElement Roporting;
    public void reportinglink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(Responsibility).perform();
        Roporting.click();
    }
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/ul/li[2]/a")
    WebElement yearbox;
    public void setYearbox(){
        yearbox.click();
    }
}
