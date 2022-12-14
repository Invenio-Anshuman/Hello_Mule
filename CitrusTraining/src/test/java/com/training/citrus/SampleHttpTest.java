package com.training.citrus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.http.client.HttpClient;

import com.consol.citrus.testng.TestNGCitrusSupport;
import static com.consol.citrus.http.actions.HttpActionBuilder.http;
public class SampleHttpTest extends TestNGCitrusSupport {
	
	 @Autowired
	    private HttpClient helloCitrus;

	    @Test
	    @CitrusTest
	    public void testGet() {
	        http()
	            .client(helloCitrus)
	            .send()
	            .get("/");
	        http()
	            .client(helloCitrus)
	            .receive()
	            .response(HttpStatus.OK);
	 
	    }
}