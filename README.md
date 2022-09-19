# shivam_fullstack_createEmployeeCredential
 IT Support Administrator  are charged with the task of creating credentials for new hire.
@ application should do the following:
a) Generate an email with the following syntax
firstNamelastName@department.company.com
b) Determine the department (Technical, Admin, Human Resource, Legal)
c) Generate a random password which will contain (number, capital letter, small letter &
special character)
d) Display the generated credentials
e) Use parameterized constructor of class Employee, to pass firstName, lastName.
f) Create a separate CredentialService which will have generatePassword,
generateEmailAddress, & showCredentials method.
--------------output-------------
please enter the department from the following
1.Technical
2.Admin
3.Human Resource
4.Legal
if input 1
Dear firstName your generated credentials are as follows
Email --->firstNamelastName@department.company.com
Password ---> random Password(any)
