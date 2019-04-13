import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homePageTest extends  homePage{

    homePage homepage;
    @BeforeMethod
    public void navigate(){
        homepage = PageFactory.initElements(ad, homePage.class);
    }

    @Test
    public void getHamburger(){
        homepage.setHamBurger();
    }

  //  @Test
    //public void getSearchButton(){homepage.checkSearchButton();}


}
