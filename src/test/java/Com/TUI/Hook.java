package Com.TUI;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    Driverfactory driverfactory=new Driverfactory();

    @Before
     public void open(){

        driverfactory.openbrowser();
    }

    @After
    public void teardown(){

        driverfactory.closebrowser();
    }
}
