package testMainPage;

import Reporting.TestLogger;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends MainPage {

    MainPage mainpage;
    @BeforeMethod
    public void navigate(){
        mainpage = PageFactory.initElements(ad, MainPage.class);
    }

    @Test
    public void getMenu(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.setMenu();
    }
    @Test
    public void getHomeButton(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.setMenu();
        mainpage.setHomeButton();
    }
    @Test
    public void getAllTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.setAllTab();
    }
    @Test
    public void getDIYTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.setDIYTab();
    }
    @Test
    public void getEaster(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.setEaster();
    }
    @Test
    public void getElectronics(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.setElectronics();
    }
    @Test
    public void getPatioTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage.setPatioTab();
    }
}
