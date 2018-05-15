package com.qa.orange.orange_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeStep {
WebDriver driver; 
@Before
public void setUp() {
System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
driver.findElement(By.id("txtUsername")).click();
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).click();
driver.findElement(By.id("txtPassword")).sendKeys("admin");
driver.findElement(By.id("btnLogin")).click();
}

@Given("^the Add Employee Tab$")
public void add_employee_tab(){ 
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
}

@When("^I fill out the Employee Details correctly$")
public void filling_employye_details_correctly() throws Throwable {
	driver.findElement(By.id("firstName")).click();
	driver.findElement(By.id("firstName")).sendKeys("Deepi");
	driver.findElement(By.id("middleName")).click();
	driver.findElement(By.id("middleName")).sendKeys("Kaur");
	driver.findElement(By.id("lastName")).click();
	driver.findElement(By.id("lastName")).sendKeys("Sidhu");
	driver.findElement(By.id("employeeId")).click();
	driver.findElement(By.id("employeeId")).sendKeys("0032");
	
	
}
@When("^I choose to create Login Details$")
public void i_choose_to_create_Login_Details() throws Throwable {
	driver.findElement(By.id("chkLogin")).click();
    throw new PendingException();
}

@When("^I fill out the Login Details correctly$")
public void i_fill_out_the_Login_Details_correctly() throws Throwable {
	driver.findElement(By.id("user_name")).click();
	driver.findElement(By.id("user_name")).sendKeys("Deepix");
	driver.findElement(By.id("user_password")).click();
	driver.findElement(By.id("user_password")).sendKeys("password8");
	driver.findElement(By.id("re_password")).click();
	driver.findElement(By.id("re_password")).sendKeys("password8");
	driver.findElement(By.id("status")).click();
	driver.findElement(By.id("btnSave")).click();

    throw new PendingException();
}

@When("^I click the Save button$")
public void i_click_the_Save_button() throws Throwable {
	driver.findElement(By.id("btnSave")).click();
    throw new PendingException();
}
@Then("^I can see information about the user$")
public void user_information() {}
}
