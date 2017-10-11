package com.celad.invest.cucumber.stepdefs;

import com.celad.invest.PrototypeApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PrototypeApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
