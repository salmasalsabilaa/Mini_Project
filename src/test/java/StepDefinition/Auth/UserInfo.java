package StepDefinition.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UserInfo {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET endpoints user info")
    public String setGetApiEndpointUserInfo(){
        return url + "auth/info";
    }

    @Step("I send GET HTTP request user info")
    public void sendGetHttpRequestUserInfo(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw")
                .when()
                .get(setGetApiEndpointUserInfo());
    }
    @Step("I set GET invalid endpoints user info")
    public String setGetApiInvalidEndpointUserInfo(){
        return url + "auth/user";
    }
    @Step("I send invalid GET HTTP request user info")
    public void sendInvalidGetHttpRequestUserInfo(){
        SerenityRest.given().post(setGetApiInvalidEndpointUserInfo());
    }
    @Step("I set GET endpoints user info without Authorazation")
    public String setGetApiEndpointUserInfoWithoutAuthorization(){
        return url + "auth/info";
    }
    @Step("I send GET HTTP request user info without Authorazation")
    public String sendGetHttpRequestUserInfoWithoutAuthorization(){
        SerenityRest.given().post(setGetApiEndpointUserInfoWithoutAuthorization());
        return null;
    }
    @Step("I receive valid HTTP response code 405")
    public void validateHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
