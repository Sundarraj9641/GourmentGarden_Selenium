Feature: Gourment Garden
@Registeration_with_valid_data
Scenario: Successfully register with valid data
Given user is on the Registration Page
When user enter the vaild details
And click on create
Then navigate to the products page
 