package HomePageTest;

import HomePage.MainPage;
import Reporting.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest extends MainPage {

    MainPage mainPage;
    @BeforeMethod
    public void navigate(){
        mainPage = PageFactory.initElements(ad, MainPage.class);
    }

    @Test
    public void clickButtons(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkButtons();

    }

    @Test
    public void clickControls(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkControls();
    }

    @Test
    public void clickTextFields(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checktextFields();
    }

    @Test
    public void clickSearchBar(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearchBar();
    }

    @Test
    public void clickTextView(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkTextView();
    }

    @Test
    public void clickPickers(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkPickers();
    }

    @Test
    public void clickImages(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkImages();
    }

    @Test
    public void clickWeb(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkWeb();
    }

    @Test
    public void clickSegments(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSegments();
    }

    @Test
    public void clickToolBar(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkToolBar();
    }

    @Test
    public void clickAlerts(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkAlerts();
    }

    @Test
    public void clickTransition(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkTransitions();
    }
    //*************************************  Buttons  *********************************

    @Test
    public void clickUIButton(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkUIButton();
    }

    @Test
    public void clickBackgroundImage(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkBackGroundImage();
    }

    @Test
    public void clickGray(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkGray();
    }

    @Test
    public void clickButtonWithImage(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkButtonWithImage();
    }

    @Test
    public void clickRightPointingArrow(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkRightPointingArrow();
    }

    @Test
    public void clickRoundedButton(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkRoundedButton();
    }

    @Test
    public void clickRounded(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkRounded();
    }

    @Test
    public void clickUISwitch(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkUISwitch();
    }

    @Test
    public void clickStandardSwitch(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkStandardSwitch();
    }

    @Test
    public void clickStandardSlider(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkStandardSlider();
    }

    @Test
    public void clickCustomizedSlider(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkCustomizedSlider();
    }

    @Test
    public void clickStandardSwitchController(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkStandardSwitchController();
    }

    @Test
    public void clickSliderController(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSliderController();
    }

    @Test
    public void clickCustomSliderController(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkCustomSliderController();
    }

    //*************************  TextField  **********************************

    @Test
    public void clickUITextField(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkUITextField();
    }


    @Test
    public void clickUITextFieldRounded(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkUITextFieldRounded();
    }

    @Test
    public void clickUIFieldSecure(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkUIFieldSecure();
    }

    @Test
    public void clickUITextFieldLeftView(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkUITextFieldLeftView();
    }
}
