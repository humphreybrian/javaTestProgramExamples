package com.funzocare.testing;

import cucumber.api.java8.En;

public class SomaLabStepDef implements En {
    public SomaLabStepDef() {
        When("^I play with number (\\d+)$", (Integer arg0) -> {
        });
        Then("^The result was Walaaah$", () -> {
        });
        Given("^You have given the valid number$", () -> {
        });
    }
}
