package Test;

import code.RpnCalculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class CalcTestSteps extends TestCase {
	RpnCalculator rpn = new RpnCalculator();
	private String result; 
	@Given("^input \"([^\"]*)\"$")
	public void input(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		result = arg1;
	}

	@When("^click \"([^\"]*)\"$")
	public void click(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}
	@Then("^output should be \"([^\"]*)\"$")
	public void output_should_be(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		assertEquals(arg1, rpn.calculate(result));
	}



}
