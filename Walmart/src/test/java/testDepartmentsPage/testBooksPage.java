package testDepartmentsPage;

import Reporting.TestLogger;
import departments.AllDepartments;
import departments.BooksPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testBooksPage extends BooksPage {
    BooksPage booksPage;

    @BeforeMethod
    public void navigate(){booksPage = PageFactory.initElements(ad, BooksPage.class);
    }

    @Test
    public void getAllTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        booksPage.setAllTab();

    }

    @Test
    public void getAllDepartments(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        booksPage.setAllTab();
        booksPage.setAllDepartments();
    }

    @Test
    public void getBooksTab(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        booksPage.setAllTab();
        booksPage.setAllDepartments();
        booksPage.setBooksTab();
    }

    @Test
    public void getChildrenBooks(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        booksPage.setAllTab();
        booksPage.setAllDepartments();
        booksPage.setBooksTab();
        booksPage.setChildrenBooks();
    }

    @Test
    public void getEbooks(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        booksPage.setAllTab();
        booksPage.setAllDepartments();
        booksPage.setBooksTab();
        booksPage.setEbooks();
    }

    @Test
    public void getReligiousNSpiritualityBooks(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        booksPage.setAllTab();
        booksPage.setAllDepartments();
        booksPage.setBooksTab();
        booksPage.setReligionNSpiritualityBooks();
    }

    @Test
    public void getFictionBooks(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        booksPage.setAllTab();
        booksPage.setAllDepartments();
        booksPage.setBooksTab();
        booksPage.setFictionBooks();
    }

    @Test
    public void getCookBooks(){
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        booksPage.setAllTab();
        booksPage.setAllDepartments();
        booksPage.setBooksTab();
        booksPage.setCookBooks();
    }
}
