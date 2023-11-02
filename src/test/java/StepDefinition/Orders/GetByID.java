package StepDefinition.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
public class GetByID {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET invalid endpoints order id")
    public String setGetApiInvalidEndpointOrderID(){
        return url + "order";
    }
    @Step("I send invalid GET HTTP request order id")
    public void sendInvalidGetHttpRequestOrderID(){
        SerenityRest.given().post(setGetApiInvalidEndpointOrderID());
    }
}
