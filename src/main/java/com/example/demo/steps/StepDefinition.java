package com.example.demo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	
	WebDriver wd;
	
	@Given("^open browser on \"(.*?)\"$")
	public void open_browser_on(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANON\\Desktop\\trash\\chrome\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get(url);
		System.out.println(url);
	}

	@Then("^get json response$")
	public void get_json_response() throws Throwable {
	    System.out.println(wd.findElement(By.tagName("body")).getText());
	}

}
