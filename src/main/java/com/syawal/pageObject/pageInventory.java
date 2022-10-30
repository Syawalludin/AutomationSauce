package com.syawal.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class pageInventory {

    public static WebDriver driver;

    public pageInventory (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement add1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement add2;

    @FindBy(xpath ="//select[@class='product_sort_container']" )
    private WebElement product;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cart;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
    private WebElement remove;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement UserName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement LastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement PostalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement Continue;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement checkprice;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement End;



    public void clickProduct(){add1.click();
   }

    public void clickproduct2(){add2.click();
   }

    public void sortProduct(String sortProduct){
        product.click();

        Select a = new Select(product);
        a.selectByVisibleText(sortProduct);

    }

    public void opencart(){
        cart.click();
    }

    public void setRemove(){remove.click();}
    public void setCheckout(){
        checkout.click();
    }

    public void setUserName(String name){
        UserName.sendKeys(name);
    }

    public void setLastName(String Lname){
        LastName.sendKeys(Lname);
    }

    public void setPostalCode(String Pcode){
        PostalCode.sendKeys(Pcode);
    }

    public void setContinue(){
        Continue.click();
    }

    public String setCheckprice(){
        checkprice.getText();
        return "$25.90";
    }

    public void setFinish(){
        finish.click();
    }

    public String setEnd(){
        End.getText();
        return "THANK YOU FOR YOUR ORDER";

    }

}


