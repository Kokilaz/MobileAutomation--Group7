package ClothingTest;

import Reporting.TestLogger;
import clothing.clothingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testClothingPage extends clothingPage {
    clothingPage clothingpage;
    @BeforeMethod
    public void navigate(){ clothingpage = PageFactory.initElements(ad, clothingPage.class);
    }

    @Test
    public void getAllTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
    }
    @Test
    public void getAllDepartments(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
    }
    @Test
    public void getClothesTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
        clothingpage.setClothesTab();
    }
    @Test
    public void getMen(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
        clothingpage.setClothesTab();
        clothingpage.setMen();
    }
    @Test
    public void getWomen(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
        clothingpage.setClothesTab();
        clothingpage.setWomen();
    }
    @Test
    public void getKids(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
        clothingpage.setClothesTab();
        clothingpage.setKids();
    }
    @Test
    public void getBigNTall(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
        clothingpage.setClothesTab();
        clothingpage.setBigNTall();
    }
    @Test
    public void getBagsNAccesories(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
        clothingpage.setClothesTab();
        clothingpage.setBagsNAccessories();
    }
    @Test
    public void getShoes(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
        clothingpage.setClothesTab();
        clothingpage.setShoes();
    }
    @Test
    public void getJuniors(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clothingpage.setAllTab();
        clothingpage.setAllDepartments();
        clothingpage.setClothesTab();
        clothingpage.setJuniors();
    }
}
