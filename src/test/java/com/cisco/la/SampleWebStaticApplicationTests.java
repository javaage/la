package com.cisco.la;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cisco.la.AppConfiguration;
import com.cisco.la.Application;
import com.jayway.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan(basePackages = "com.cisco.la")
@SpringApplicationConfiguration(classes = {Application.class, AppConfiguration.class})
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class SampleWebStaticApplicationTests {
	
    @Before
    public void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }
    
    @Test
	public void tempTest(){
	}
    
}

