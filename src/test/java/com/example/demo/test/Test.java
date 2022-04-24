package com.example.demo.test;

import com.example.demo.page.LoginPage;
import com.example.demo.page.PlansPage;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {
    LoginPage loginPage = new LoginPage();
    PlansPage plansPage = new PlansPage();
    String username = "admin";
    String password = "init";
    String nameOfPlan = "new";


    @org.junit.jupiter.api.Test
    public void login() {
      loginPage.login("admin","init");
    }

    @org.junit.jupiter.api.Test
    public void createNewTestPlan() {
        loginPage.login(username,password);
        plansPage.createNewDefaultPlan(nameOfPlan);
        assertTrue($x("//span[text()='"+nameOfPlan+"']").isDisplayed());
    }
}