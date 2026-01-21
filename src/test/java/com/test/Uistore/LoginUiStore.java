package com.test.Uistore;

import org.openqa.selenium.By;

public class LoginUiStore {
	
    public static By Username=By.id("usernameField");
    public static By Password= By.id("passwordField");
    public static By Login= By.xpath("//button[text()='Login']");
    public static By ViewProfile= By.xpath("//div[@class='view-profile-wrapper']//a[@href=\"/mnjuser/profile\"]");
    public static By UpdateResume= By.xpath("//input[@value='Update resume']");
    public static By Fileupload= By.xpath("//input[@id='attachCV']");
	
}
