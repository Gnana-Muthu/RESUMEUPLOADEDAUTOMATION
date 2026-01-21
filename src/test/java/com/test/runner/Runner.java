package com.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
    features = "src/test/resources", // Update this path if your .feature files are in a subfolder
    glue = {"com.test.StepDefinition"}, // Ensure this package contains your step definitions
    plugin = {"pretty"}, // Add more plugins if needed (e.g., JSON, HTML reports)
    dryRun = false, // Set to true to validate feature file mappings without running tests
    monochrome = true // Keeps console output clean and readable
    // tags = "@login" // Uncomment and use tags to filter scenarios if needed
)
public class Runner extends AbstractTestNGCucumberTests {

    @AfterSuite
    public void cleanUp() {
        // Add cleanup logic here if needed (e.g., closing resources)
        System.out.println("Test suite execution completed. Performing cleanup...");
    }
}
