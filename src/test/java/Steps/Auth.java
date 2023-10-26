package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import StepDefinition.Auth.Login;
import StepDefinition.Auth.Register;
import StepDefinition.Auth.UserInfo;
public class Auth {
    @Steps
    Register register;
    @Steps
    Login login;
    @Steps
    UserInfo userinfo;


    @Given("I set POST invalid endpoints register")
    public void setPostApiInvalidEndpointRegister() {
        register.setPostApiInvalidEndpointRegister();
    }

    @When("I send invalid POST HTTP request register")
    public void sendInvalidPostHTTPRequestRegister() {
        register.sendInvalidPostHttpRequestRegister();
    }

    @Then("I receive valid HTTP response code 404")
    public void ReceiveValidHTTPResponseCode404(){
        register.ReceiveValidHTTPResponseCode404();
    }


    @Given("I set POST endpoints login")
    public void setPostApiEndpointLogin() {
        login.setPostApiEndpointLogin();
    }

    @When("I send POST HTTP request login")
    public void sendPostHTTPRequestLogin() {
        login.sendPostHttpRequestLogin();
    }
    @Given("I set POST invalid endpoints login")
    public void setPostApiInvalidEndpointLogin() {
        login.setPostApiInvalidEndpointLogin();
    }

    @When("I send invalid POST HTTP request login")
    public void sendInvalidPostHTTPRequestLogin() {
        login.sendInvalidPostHttpRequestLogin();
    }
    @Then("I receive valid HTTP response code 200")
    public void ReceiveValidHTTPResponseCode200(){
        login.ReceiveValidHTTPResponseCode200();
    }

    @Given("I set GET endpoints user info")
    public void setGetApiEndpointUserInfo() {
        userinfo.setGetApiEndpointUserInfo();
    }

    @When("I send GET HTTP request user info")
    public void sendGetHTTPRequestUserInfo() {
        userinfo.sendGetHttpRequestUserInfo();
    }
    @Given("I set GET invalid endpoints user info")
    public void setGetApiInvalidEndpointUserInfo() {
        userinfo.setGetApiInvalidEndpointUserInfo();
    }

    @When("I send invalid GET HTTP request user info")
    public void sendInvalidGetHTTPRequestUserInfo() {
        userinfo.sendInvalidGetHttpRequestUserInfo();
    }
    @Then("I receive valid HTTP response code 405")
    public void receiveHTTPResponseCode405(){
        userinfo.validateHttpResponseCode405();
    }

}
