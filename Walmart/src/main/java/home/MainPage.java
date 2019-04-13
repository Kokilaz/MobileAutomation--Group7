package home;

import common.mobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends mobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    WebElement menu;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView\n")
    WebElement HomeButton;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Browse all departments.']")
    WebElement allTab;
   // @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView\n")
    //WebElement BabyTab;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Browse DIY & Done.']")
    WebElement DIYTab;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Browse Easter.']")
    WebElement Easter;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Browse Electronics.']")
    WebElement Electronics;
    @FindBy(xpath = "//android.widget.Button[@content-desc='Browse Patio & Garden.']")
    WebElement PatioTab;


    public void setMenu(){
        menu.click();
    }

    public void setHomeButton(){
        HomeButton.click();
    }

    public void setAllTab(){
        allTab.click();
    }

   // public void setBabyTab(){
     //   BabyTab.click();
   // }

    public void setDIYTab(){
        DIYTab.click();
    }

    public void setEaster(){
        Easter.click();
    }

    public void setElectronics(){
        Electronics.click();
    }

    public void setPatioTab(){
        PatioTab.click();
    }

}
