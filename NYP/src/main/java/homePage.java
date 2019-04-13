import common.mobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class homePage extends mobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    WebElement hamBurger;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
    WebElement searchButton;

    public void setHamBurger(){
      hamBurger.click();
    }

    public void checkSearchButton(){
        searchButton.click();
    }


}
