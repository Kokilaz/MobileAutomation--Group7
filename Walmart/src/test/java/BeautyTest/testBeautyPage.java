package testDepartmentsPage;

import Reporting.TestLogger;
import Baby.BabyPage;
import Beauty.BeautyPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testBeautyPage extends BabyPage {

BeautyPage beautyPage;
    @BeforeMethod
    public void navigate(){ beautyPage = PageFactory.initElements(ad, BeautyPage.class);
    }

    @Test
    public void getAllTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyPage.setAllTab();

    }

    @Test
    public void getAllDepartments() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyPage.setAllTab();
        beautyPage.setAllDepartments();
    }

    @Test
    public void getBeautyTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyPage.setAllTab();
        beautyPage.setAllDepartments();
        beautyPage.setBeautyTab();
    }

    @Test
    public void getHairCare(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyPage.setAllTab();
        beautyPage.setAllDepartments();
        beautyPage.setBeautyTab();
        beautyPage.setHairCare();
    }

    @Test
    public void getMakeUp(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyPage.setAllTab();
        beautyPage.setAllDepartments();
        beautyPage.setBeautyTab();
        beautyPage.setMakeUp();
    }

    @Test
    public void getSkinCare(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyPage.setAllTab();
        beautyPage.setAllDepartments();
        beautyPage.setBeautyTab();
        beautyPage.setSkinCare();
    }

    @Test
    public void getFragrance(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyPage.setAllTab();
        beautyPage.setAllDepartments();
        beautyPage.setBeautyTab();
        beautyPage.setFragrance();
    }

    @Test
    public void getAromatherapy(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyPage.setAllTab();
        beautyPage.setAllDepartments();
        beautyPage.setBeautyTab();
        beautyPage.setBeautyTab();
        beautyPage.setAromaTherapy();
    }
}
