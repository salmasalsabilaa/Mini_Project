package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import StepDefinition.Product_Category.DeleteCategory;
import StepDefinition.Product_Category.GetAllCategory;
import StepDefinition.Product_Category.GetCategoryByID;
import StepDefinition.Product_Category.PostCreateCategory;

public class ProductCategory {
    @Steps
    PostCreateCategory postcreatecategory;
    @Steps
    GetCategoryByID getcategorybyid;
    @Steps
    GetAllCategory getallcategory;
    @Steps
    DeleteCategory deletecategory;

    @Given("I set POST endpoints categories")
    public void setPostApiEndpointCategories(){
        postcreatecategory.setPostApiEndpointCategories();
    }
    @When("I send POST HTTP request categories")
    public void sendPostHTTPRequestCategories(){
        postcreatecategory.sendPostHttpRequestCategories();
    }
    @Given("I set POST invalid endpoints categories")
    public void setPostApiInvalidEndpointCategories(){
        postcreatecategory.setPostApiInvalidEndpointCategories();
    }
    @When("I send invalid POST HTTP request categories")
    public void sendPostHTTPRequestInvalidCategories(){
        postcreatecategory.sendPostHttpRequestInvalidCategories();
    }

    @Given("I set GET invalid endpoints category By ID")
    public void setGetApiInvalidEndpointCategoriesByID(){
        getcategorybyid.setApiInvalidEndpointCategoryByID();
    }
    @When("I send GET HTTP request category By ID")
    public void sendGetHTTPRequestCategoriesByID(){
        getcategorybyid.sendGetHttpRequestCategoryByID();
    }
    @When("I send invalid GET HTTP request category By ID")
    public void sendGetHTTPRequestInvalidCategoriesByID(){
        getcategorybyid.sendInvalidGetHttpRequestCategoryByID();
    }


    @Given("I set GET endpoints to all category")
    public void setGetApiEndpointAllCategory(){
        getallcategory.setApiEndpointAllCategory();
    }
    @When("I send GET HTTP request to all category")
    public void sendGetHTTPRequestAllCategory(){
        getallcategory.sendGetHttpRequestAllCategory();
    }
    @Given("I set GET invalid endpoints to all category")
    public void setGetApiInvalidEndpointAllCategory(){
        getallcategory.setApiInvalidEndpointAllCategory();
    }
    @When("I send invalid GET HTTP request to all category")
    public void sendInvalidGetHTTPRequestAllCategory(){
        getallcategory.sendInvalidGetHttpRequestAllCategory();
    }


    @Given("I set DELETE endpoints category")
    public void setDeleteEndpointCategory(){
        deletecategory.setDeleteEndpointCategory();
    }
    @When("I send DELETE HTTP request category")
    public void sendDeleteHttpRequestCategory(){
        deletecategory.sendDeleteHttpRequestCategory();
    }

}
