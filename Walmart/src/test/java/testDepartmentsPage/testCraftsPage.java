package testDepartmentsPage;

import Reporting.TestLogger;
import departments.AllDepartments;
import departments.craftsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCraftsPage extends craftsPage {
    craftsPage craftspage;

    @BeforeMethod
    public void navigate() {
        craftspage = PageFactory.initElements(ad, craftsPage.class);
    }

    @Test
    public void getAllTab() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();

    }

    @Test
    public void getAllDepartments() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();
        craftspage.setAllDepartments();
    }

    @Test
    public void getCraftsTAb() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();
        craftspage.setAllDepartments();
        craftspage.setCraftsTab();
    }

    @Test
    public void getSewing() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();
        craftspage.setAllDepartments();
        craftspage.setCraftsTab();
        craftspage.setSewing();
    }

    @Test
    public void getArtSupplies() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();
        craftspage.setAllDepartments();
        craftspage.setCraftsTab();
        craftspage.setArtSupplies();
    }

    @Test
    public void getCrafting(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();
        craftspage.setAllDepartments();
        craftspage.setCraftsTab();
        craftspage.setCrafting();
    }

    @Test
    public void getfabric(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();
        craftspage.setAllDepartments();
        craftspage.setCraftsTab();
        craftspage.setFabric();
    }

    @Test
    public void getScrapbooking(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();
        craftspage.setAllDepartments();
        craftspage.setCraftsTab();
        craftspage.setScrapbooking();
    }

    @Test
    public void getCrayola(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        craftspage.setAllTab();
        craftspage.setAllDepartments();
        craftspage.setCraftsTab();
        craftspage.setCrayola();
    }
    }

