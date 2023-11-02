package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import StepDefinition.Orders.POST;
import StepDefinition.Orders.GetAll;
import StepDefinition.Orders.GetByID;

public class Orders {
    @Steps
    POST postcreateorder;
    @Steps
    GetAll getallorders;
    @Steps
    GetByID getorderid;

    @Given("I set POST endpoints order")
    public void setPostApiEndpointOrder() {
        postcreateorder.setPostApiEndpointOrder();
    }

    @When("I send POST HTTP request order")
    public void sendPostHTTPRequestOrder() {
        postcreateorder.sendPostHttpRequestOrder();
    }
    @Given("I set POST invalid endpoints order")
    public void setPostApiInvalidEndpointOrder() {
        postcreateorder.setPostApiInvalidEndpointOrder();
    }

    @When("I send invalid POST HTTP request order")
    public void sendInvalidPostHTTPRequestOrder() {
        postcreateorder.sendInvalidPostHttpRequestOrder();
    }
    @Given("I set GET endpoints orders")
    public void setGetApiEndpointOrders() {
        getallorders.setGetApiEndpointOrders();
    }
    @When("I send GET HTTP request orders")
    public void sendGetHTTPRequestOrders() {
        getallorders.sendGetHttpRequestOrders();
    }
    @Given("I set GET invalid endpoints orders")
    public void setGetApiInvalidEndpointOrders() {
        getallorders.setGetApiInvalidEndpointOrders();
    }

    @When("I send invalid GET HTTP request orders")
    public void sendInvalidGetHTTPRequestOrders() {
        getallorders.sendInvalidGetHttpRequestOrders();
    }
    @Given("I set GET invalid endpoints order id")
    public void setGetApiInvalidEndpointOrderID() {
        getorderid.setGetApiInvalidEndpointOrderID();
    }

    @When("I send invalid GET HTTP request order id")
    public void sendInvalidGetHTTPRequestOrderID() {
        getorderid.sendInvalidGetHttpRequestOrderID();
    }
}
