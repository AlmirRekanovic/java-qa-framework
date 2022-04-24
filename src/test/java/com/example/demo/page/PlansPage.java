package com.example.demo.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.*;

public class PlansPage {
    private final SelenideElement typeDropdown = $x("//label[text()='Type']/..//select");
    private final SelenideElement templateDropdown = $x("//label[text()='Template']/..//select");
    private final SelenideElement nameField = $x("//label[text()='Name']/..//input");
    private final SelenideElement newPlanButton = $x("//button[text()='New plan']");
    private final SelenideElement saveButton = $x("//button[@ng-click='save(false)']");
    private final SelenideElement cancelButton = $x("//label[text()='cancel()']/..//input");
    private final SelenideElement saveAndEditButton = $x("//label[text()='save(true)']/..//input");

    public void createNewDefaultPlan(String name){
        newPlanButton.click();
        nameField.sendKeys(name);
        saveButton.click();
    }

    public void createNewPlan(String name, String template){
        newPlanButton.click();
        nameField.sendKeys(name);
        templateDropdown.click();
        $x("//option[@label='"+template+"']").click();
        saveButton.click();
    }

}
