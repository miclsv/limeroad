@tag1
Feature: LimeRoad Order for a Men product

  @tag1
  Scenario: To search a product for men
    Given User launch the url "https://www.limeroad.com/"
    And User click on shop men

  @tag1
  Scenario: Search a T-shirt Style
    Given User click on T-shirt
    When Choose the fisrt model
        
  @tag1
  Scenario: Pick a T Shirt 
  	Given User click on first product
  	When Select size
  	Then  Add to Cart
    
