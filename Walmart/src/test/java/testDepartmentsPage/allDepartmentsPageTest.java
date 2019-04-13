package testDepartmentsPage;

import Reporting.TestLogger;
import departments.AllDepartments;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class allDepartmentsPageTest extends AllDepartments {

 AllDepartments allDepartments;

    @BeforeMethod
    public void navigate(){ allDepartments = PageFactory.initElements(ad, AllDepartments.class);
    }

    @Test
    public void getAllTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();

    }

    @Test
    public void getAllDepartments(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setAllDepartments();

    }

    @Test
    public void getAutoNTiresTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setAutoNTiresTab();
    }

    @Test
    public void getBabyTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setBabyTab();
    }

    @Test
    public void getBeautyTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setBeautyTab();
    }

    @Test
    public void getBooksTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setBooksTab();
    }

    @Test
    public void getCellPhonesTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setCellPhonesTab();
    }

    @Test
    public void getClothesTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setClothesTab();
    }

    @Test
    public void getElectronics(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setElectronics();
    }

    @Test
    public void getFoodTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setFoodTab();
    }

    @Test
    public void getFurnitureTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setFurnitureTab();
    }

    @Test
    public void getGiftsTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setGiftsTab();
    }

    @Test
    public void getHealthTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setHealthTab();
    }
    @Test
    public void getHomeImprovement(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setHomeImprovementTab();
    }

    @Test
    public void getHouseEssentialsTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setHouseHoldEssentialsTab();
    }

    @Test
    public void getIndustrialTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setIndustrialTab();
    }

    @Test
    public void getJewelryTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setJewelryTab();
    }

    @Test
    public void getMoviesTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setMoviesTab();
    }

    @Test
    public void getMusicTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setMusicTab();
    }

    @Test
    public void getOfficeTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setOfficeTab();
    }

    @Test
    public void getPartyNOccationTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setPartyNOccationTab();
    }

    @Test
    public void getPatioTab() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setPatioTab();
    }
    @Test
    public void getPetsTab() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setPetsTab();
    }

    @Test
    public void getSportsTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setSportsTab();
    }

    @Test
    public void getToysTab() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setToysTab();
    }

    @Test
    public void getVideoGamesTab() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        allDepartments.setAllTab();
        allDepartments.setVideoGamesTab();
    }
}


