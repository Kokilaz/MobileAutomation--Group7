package HomePage;

import common.mobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends mobileAPI {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    WebElement buttons;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    WebElement controls;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    WebElement textFields;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
    WebElement searchBar;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]")
    WebElement textView;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]")
    WebElement pickers;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]")
    WebElement images;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]")
    WebElement web;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]")
    WebElement segments;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]")
    WebElement toolBar;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]")
    WebElement alerts;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]")
    WebElement transitions;

    public void checkButtons(){
        buttons.click();
    }

    public void checkControls(){
        controls.click();
    }

    public void checktextFields(){
        textFields.click();
    }

    public void checkSearchBar(){
        searchBar.click();
    }

    public void checkTextView(){
        textView.click();
    }

    public void checkPickers(){
        pickers.click();
    }

    public void checkImages(){
        images.click();
    }

    public void checkWeb(){
        web.click();
    }

    public void checkSegments(){
        segments.click();
    }

    public void checkToolBar(){
        toolBar.click();
    }

    public void checkAlerts(){
        alerts.click();
    }

    public void checkTransitions(){
        transitions.click();
    }
//*********************************. buttons. *******************************

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contact Add\"]")
    WebElement uiButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Background Image\"]")
    WebElement backGroundImage;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    WebElement gray;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Button with Image\"]")
    WebElement buttonWithImage;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    WebElement rightPointingArrow;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Rounded Button\"]")
    WebElement roundedButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Rounded\"]")
    WebElement rounded;
    //controls
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Stepper 1 to 10\"]")
    WebElement uiSwitch;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Standard Switch\"]")
    WebElement standardSwitch;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Standard Slider\"]")
    WebElement standardSlider;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Customized Slider\"]")
    WebElement customizedSlider;

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")
    WebElement standardSwitchController;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Standard\"]")
    WebElement sliderController;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Custom\"]")
    WebElement customSliderController;

    public void checkUIButton(){
        checkButtons();
        uiButton.click();}
    public void checkBackGroundImage(){
        checkButtons();
        backGroundImage.click();}
    public void checkGray(){
        checkButtons();
        gray.click();}
    public void checkButtonWithImage(){
        checkButtons();
        buttonWithImage.click();}
    public void checkRightPointingArrow(){
        checkButtons();
        rightPointingArrow.click();}
    public void checkRoundedButton(){
        checkButtons();
        roundedButton.click();}
    public void checkRounded(){
        checkButtons();
        rounded.click();}
    public void checkUISwitch(){
        checkButtons();
        uiSwitch.click();}
    public void checkStandardSwitch(){
        checkButtons();
        standardSwitch.click();}
    public void checkStandardSlider(){
        checkButtons();
        standardSlider.click();}
    public void checkCustomizedSlider(){
        checkButtons();
    customizedSlider.click();}
    public void checkStandardSwitchController(){
        checkButtons();
        standardSwitchController.click();}
    public void checkSliderController(){
        checkButtons();
        sliderController.click();}
    public void checkCustomSliderController(){
        checkButtons();
        customSliderController.click();}


//***********************.   textfield.  **************************************

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField\"]")
    WebElement uiTextField;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField Rounded\"]")
    WebElement uiTextFieldRounded;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField Secure\"]")
    WebElement uiTextFieldSecure;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UITextField (with LeftView)\"]")
    WebElement uiTextFieldLeftView;

    public void checkUITextField(){
        checktextFields();
        uiTextField.click();}
    public void checkUITextFieldRounded(){
        checktextFields();
        uiTextFieldRounded.click();}
    public void checkUIFieldSecure(){
        checktextFields();
        uiTextFieldSecure.click();}
    public void checkUITextFieldLeftView(){
        checktextFields();
        uiTextFieldLeftView.click();}
}

