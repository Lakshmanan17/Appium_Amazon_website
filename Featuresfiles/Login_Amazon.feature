Feature: login Amazon portal
Scenario: Login user with valid credentials
Given Install App and login the page
And Click signin button
When User enter valid Email="lakshmansuriya@gmail.com"  
And Click continue button
When Enter valid password="9600642238"
And Click sign in button
Then Navigate to the home page 