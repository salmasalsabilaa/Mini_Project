package StepDefinition.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoints login")
    public String setPostApiEndpointLogin(){
        return url + "auth/login";
    }

    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "someone@mail.com");
        requestBody.put("Password", "123123");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }
    @Step("I set POST invalid endpoints login")
    public String setPostApiInvalidEndpointLogin(){
        return url + "login";
    }
    @Step("I send invalid POST HTTP request login")
    public void sendInvalidPostHttpRequestLogin(){
        SerenityRest.given().post(setPostApiInvalidEndpointLogin());
    }

    @Step("I receive valid HTTP response code 200")
    public void ReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
