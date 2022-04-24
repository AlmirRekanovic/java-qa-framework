package com.example.demo.page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("http://localhost:8080/");
    }

    private final SelenideElement loginButton = $x("//button[@type='submit']");
    private final SelenideElement usernameField = $x("//input[@placeholder='Username']");
    private final SelenideElement passwordField = $x("//input[@placeholder='Password']");

    public void login(String Username, String Password){
        loginButton.click();
    }
}
