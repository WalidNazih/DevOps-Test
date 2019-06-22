package com.example.demo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="C:\\Users\\ANON\\Desktop\\DevOps\\DevOps-Test\\src\\main\\java\\com\\example\\demo\\features",
			glue={"com.example.demo.steps"}
		)

public class TestRunner {

}
