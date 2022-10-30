package step_definitions;

import cucumber.api.java.en.And;
import gherkin.lexer.Pa;
import org.junit.Assert;
import com.syawal.pageObject.pageInventory;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;

import static org.junit.Assert.assertEquals;

public class purchaseSteps {

    private WebDriver webDriver;

    public purchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User sort product list by \"(.*)\"")
    public void selectProductCart(String sortProduct) throws InterruptedException {
        pageInventory InventoryPage = new pageInventory(webDriver);
        Thread.sleep(3000);
        InventoryPage.sortProduct(sortProduct);

    }

    @And("User click add to cart")
    public void addcart() throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        PageInventory.clickproduct2();
        PageInventory.clickProduct();
        Thread.sleep(3000);
    }

    @And("User click open cart for seeing the product that has been selected")
    public void cartopen() throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        PageInventory.opencart();
        Thread.sleep(3000);
    }

    @And("User clik removing button for removing item for cart")
    public void removing() throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        PageInventory.setRemove();
        Thread.sleep(3000);

    }

    @And("User click button checkout")
    public void selectcheckout() throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        PageInventory.setCheckout();
        Thread.sleep(3000);
    }

    @Then("User input persoal data startting from first name \"(.*)\" and user input last name \"(.*)\" and user input postal code \"(.*)\"")
    public void inputInformation(String Fname, String Lname, String Pcode) throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        PageInventory.setUserName(Fname);
        PageInventory.setLastName(Lname);
        PageInventory.setPostalCode(Pcode);
        Thread.sleep(3000);
    }

    @Then("User click button continue")
    public void clickcontinue() throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        PageInventory.setContinue();
        Thread.sleep(3000);
    }

    @Then("User check on item total \"(.*)\" and Tax price \"(.*)\" and total price \"(.*)\"")
    public void pricecheck(String ExpectedI, String ExpectedT, String Expectedt) throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        String Item = PageInventory.setSubtotal();
        Assert.assertEquals(Item, ExpectedI);

        String Tax = PageInventory.setTax();
        Assert.assertEquals(Tax, ExpectedT);

        String total = PageInventory.setCheckprice();
        Assert.assertEquals(total, Expectedt);
        Thread.sleep(3000);
    }

    @And("User click button Finish for and transaktion")
    public void clikFinish() throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        PageInventory.setFinish();
        Thread.sleep(3000);
    }

    @Then("User seeing text \"(.*)\" for the and order")
    public void endstep(String Expectedtext) throws InterruptedException {
        pageInventory PageInventory = new pageInventory(webDriver);
        String text = PageInventory.setEnd();
        Assert.assertEquals(text, Expectedtext);
    }
}
