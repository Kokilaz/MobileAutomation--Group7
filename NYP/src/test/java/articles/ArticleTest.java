package articles;

import common.mobileAPI;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ArticleTest extends mobileAPI {

    @Test
    public void testArticles(){
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.goToArticles();
    }

}

