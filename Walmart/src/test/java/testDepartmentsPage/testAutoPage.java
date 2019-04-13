package testDepartmentsPage;

import Reporting.TestLogger;
import departments.AllDepartments;
import departments.AutoPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testAutoPage extends AutoPage {

    AutoPage autoPage;
    @BeforeMethod
    public void navigate(){ autoPage = PageFactory.initElements(ad, AutoPage.class);
    }

    @Test
    public void getAllTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
    }

    @Test
    public void getAllDepartments(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
        autoPage.setAllDepartments();
    }

    @Test
    public void getAutoNTiresTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
        autoPage.setAllDepartments();
        autoPage.setAutoNTiresTab();
    }


    @Test
    public void getTires(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
        autoPage.setAllDepartments();
        autoPage.setAutoNTiresTab();
        autoPage.setTires();
    }

    @Test
    public void getOilsNFluids(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
        autoPage.setAllDepartments();
        autoPage.setAutoNTiresTab();
        autoPage.setOilsNFluids();
    }

    @Test
    public void getAutomativeReplacementParts(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAutomativeReplacementParts();
        autoPage.setAllTab();
        autoPage.setAllDepartments();
        autoPage.setAutoNTiresTab();
        autoPage.setAutomativeReplacementParts();
    }

    @Test
    public void getAutoElectronics(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
        autoPage.setAllDepartments();
        autoPage.setAutoNTiresTab();
        autoPage.setAutoElectronics();
    }

    @Test
    public void getAutomativeTools(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
        autoPage.setAllDepartments();
        autoPage.setAutoNTiresTab();
        autoPage.setAutomativeTools();
    }

    @Test
    public void getExteriorCarAccessories(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
        autoPage.setAllDepartments();
        autoPage.setAutoNTiresTab();
        autoPage.setExteriorCarAccessories();
    }

    @Test
    public void getRvPartsAccessories(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        autoPage.setAllTab();
        autoPage.setAllDepartments();
        autoPage.setAutoNTiresTab();
        autoPage.setRvPartsNAccessories();
    }
}
