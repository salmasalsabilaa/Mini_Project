package StepDefinition.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GetAll {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET endpoints orders")
    public String setGetApiEndpointOrders(){
        return url + "orders";
    }

    @Step("I send GET HTTP request orders")
    public void sendGetHttpRequestOrders(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetApiEndpointOrders());
    }
    @Step("I set GET invalid endpoints orders")
    public String setGetApiInvalidEndpointOrders(){
        return url + "order";
    }
    @Step("I send invalid GET HTTP request orders")
    public void sendInvalidGetHttpRequestOrders(){
        SerenityRest.given().post(setGetApiInvalidEndpointOrders());
    }
}
