# 📋 **Description**

## **_Banking Web App_**

The Banking Web App is a Spring Boot -based Web application (Java 17) that allows users to manage their bank accounts.
The app supports basic banking functions such as:

* Create and delete user account
* Add money to an account
* Transfer of money to another user

View Balance and History of Transactions

In future upgrading, it also incorporates AI functionality for transaction analysis and financial behavior proposals.

## **🚀 Technologies**

* Java 17
* Spring Boot 3.5.5
  * Spring Web
  * Spring data jpa
  * Spring Security (optional)
* Postgresql for data storage
* Maven for management management
* Lombok, Model mapper for easier growth

## 🧩 Use Cases
1. NEW user -> Creation -> The user enters personal information and creates a bank account.
2. Existing user -> Delete account -> The user may delete his account if he does not wish to continue cooperation.
3. Existing user -> Deposit -> The user adds amount to his account.
4. Existing user -> transfer money -> The user sends money to another user.
5. Existing user -> View Balance & History -> The user sees the available balance and previous transactions. <br>

## 🤖 AI functions (optional)

Exit Analysis: He suggests how to save money the user.

Patterns Recognition: detects unusual transactions or possible errors.

Personalized notifications: warns of low balance or high charges.

Financial Insights: Creates a monthly activity summary.

## 🗂️ Project Structure (Maven)

bank-web-app/
│
├── src/ <br>
│   ├── main/ <br>
│   │   ├── java/com/example/bankapp/ <br>
│   │   │   ├── controller/ <br>
│   │   │   ├── service/ <br>
│   │   │   ├── repository/ <br>
│   │   │   ├── model/<br>
│   │   │   └── BankWebAppApplication.java <br>
│   │   └── resources/ <br>
│   │       ├── application.yml <br>
│   │       └── schema.sql <br>
│   └── test/ <br>
│       └── ... <br>
│
├── pom.xml <br>
└── README.md <br>

[Open System Architecture Diagram](https://app.diagrams.net/?mode=github#Hjohnsmith/project/main/docs/system.drawio](https://app.diagrams.net/#LBankWebApp.drawio#%7B%22pageId%22%3A%22gZl4-MNB_K2jVca2RsHO%22%7D))
