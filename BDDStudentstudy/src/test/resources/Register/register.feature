Feature: Register Page

Scenario: Invalid Student Name
Given User is on 'Registration' Page
When user enters invalid Name
Then display 'Please Enter Name' 

Scenario: Invalid Student Address
Given User is on 'Registration' Page
When user enters invalid Address
Then display 'Please Enter Addresss' 

Scenario: Invalid Student Marks
Given User is on 'Registration' Page
When user enters invalid Marks
Then display 'Please Enter Marks' 
