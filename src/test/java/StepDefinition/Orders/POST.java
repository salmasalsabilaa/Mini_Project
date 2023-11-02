package StepDefinition.Orders;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoints order")
    public String setPostApiEndpointOrder(){
        return url + "orders";
    }

    @Step("I send POST HTTP request order")
    public void sendPostHttpRequestOrder() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("Product_id", 13222);
        requestBody.put("Quantity", 1);
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointOrder());
    }
    @Step("I set POST invalid endpoints order")
    public String setPostApiInvalidEndpointOrder(){
        return url + "order";
    }
    @Step("I send invalid POST HTTP request order")
    public void sendInvalidPostHttpRequestOrder(){
        SerenityRest.given().post(setPostApiInvalidEndpointOrder());
    }
}
