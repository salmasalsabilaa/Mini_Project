package StepDefinition.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints register")
    public String setPostApiEndpointRegister(){
        return url + "auth/register";
    }

    @Step("I send POST HTTP request register")
    public void sendPostHttpRequestRegister(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "someone@mail.com");
        requestBody.put("Password", "123123");
        requestBody.put("Fullname", "Firstname Lastname");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }
    @Step("I set POST invalid endpoints register")
    public String setPostApiInvalidEndpointRegister(){
        return url + "register";
    }
    @Step("I send invalid POST HTTP request register")
    public void sendInvalidPostHttpRequestRegister(){
        SerenityRest.given().post(setPostApiInvalidEndpointRegister());
    }
    @Step("I receive valid HTTP response code 200")
    public void ReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 404")
    public void ReceiveValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

}