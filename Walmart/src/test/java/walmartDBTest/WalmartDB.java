package walmartDBTest;

import Reporting.TestLogger;
import common.mobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmartDB.dataBase;

import static common.mobileAPI.convertToString;

public class WalmartDB extends mobileAPI {


    dataBase database;

    @BeforeMethod
    public void init(){
       database = PageFactory.initElements(ad, dataBase.class);
    }

    @Test
    public void testSearchDB()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        database.searchItems();
    }
}



