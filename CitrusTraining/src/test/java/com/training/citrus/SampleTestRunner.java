package com.training.citrus;

import org.testng.annotations.Test;
import static com.consol.citrus.actions.EchoAction.Builder.echo;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.TestNGCitrusSupport;
@Test
public class SampleTestRunner extends TestNGCitrusSupport {
	@CitrusTest
	public void ServiceTest() {
		run(echo("before Service Call"));
		
		run(echo("After Service Call"));
	}

}
