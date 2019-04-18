package BabyTest;

import Reporting.TestLogger;
import Baby.BabyPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testBabyPage extends BabyPage {

    BabyPage babyPage;

    @BeforeMethod
    public void navigate() {
        babyPage = PageFactory.initElements(ad, BabyPage.class);
    }

    @Test
    public void getAllTab() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
    }
    @Test
    public void getAllDepartments() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
        babyPage.setAllDepartments();
    }
    @Test
    public void getBabyTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
        babyPage.setAllDepartments();
        babyPage.setBabyTab();
    }
    @Test
    public void getFeeding(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
        babyPage.setAllDepartments();
        babyPage.setBabyTab();
        babyPage.setFeeding();
    }
    @Test
    public void getDiapering(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
        babyPage.setAllDepartments();
        babyPage.setBabyTab();
        babyPage.setDiapering();
    }
    @Test
    public void getCarSeats(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
        babyPage.setAllDepartments();
        babyPage.setBabyTab();
        babyPage.setCarSeats();
    }
    @Test
    public void getStrollers(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
        babyPage.setAllDepartments();
        babyPage.setBabyTab();
        babyPage.setStrollers();
    }
    @Test
    public void getToddler(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
        babyPage.setAllDepartments();
        babyPage.setBabyTab();
        babyPage.setToddler();
    }
    @Test
    public void getNursery(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        babyPage.setAllTab();
        babyPage.setAllDepartments();
        babyPage.setBabyTab();
        babyPage.setNursery();
    }
}
