package walmartDB;

import Databases.ConnectToSqlDB;
import common.mobileAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class dataBase extends mobileAPI {

        ConnectToSqlDB database = new ConnectToSqlDB();

        @FindBy(css = "#search-query")
        WebElement searchInput;
        public void setSearchInput(String items)throws Exception{
            searchInput.sendKeys(items, Keys.ENTER);
            Thread.sleep(1000);
        }
        public void clearInput(){
            searchInput.clear();
        }
        public void searchItems()throws Exception{
            List<String> list = database.readDataBase("Walmart","items");
            for ( int i =0; i < list.size(); i++){
                setSearchInput(list.get(i));
                clearInput();
            }
        }
    }


