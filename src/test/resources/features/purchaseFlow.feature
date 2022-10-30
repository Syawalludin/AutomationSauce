@PurchaseFlow

  Feature: Purchase Flow
    As user want to purchase item

  Scenario: User will short item by Name (Z to A)
    Given User open the web page
    When  User input "standard_user" as userName and "secret_sauce" as password
    Then User sort product list by "Name (Z to A)"
    And User click add to cart
    And User click open cart for seeing the product that has been selected
    And User clik removing button for removing item for cart
    And User click button checkout
    Then User input persoal data startting from first name "Syawal" and user input last name "Ludin" and user input postal code "Syawal123"
    And User click button continue
    Then User check on item total "$15.99" and Tax price "$1.28" and total price "$17.27"
    And User click button Finish for and transaktion
    Then User seeing text "THANK YOU FOR YOUR ORDER" for the and order
