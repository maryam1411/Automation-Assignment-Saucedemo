# Automation-Assignment-Saucedemo

This project contains automated tests for the Saucedemo.com website using Selenium, JUnit, and Java. The tests are designed to run on Chrome browsers.

## Table of Contents

1. [Objective](#objective)
2. [Technology Stack](#technology-stack)
3. [Setup](#setup)
4. [Test Cases](#test-cases)
5. [Configuration](#configuration)
6. [Running the Tests](#running-the-tests)
7. [Reporting](#reporting)
8. [Challenges Faced](#challenges-faced)


## Objective

The main objective of this project is to create automated tests for various functionalities of the Saucedemo.com website.

## Technology Stack

- Java
- Selenium WebDriver
- JUnit
- JSON (for data management)

## Setup

1. Clone this repository:
2. Install Java JDK (version 8 or higher) and set up the JAVA_HOME environment variable.

3. Install Maven and set up the PATH environment variable.

4. Install the required dependencies using Maven:

## Test Cases

1. Successful Sign In
2. Add Items to Cart and Remove Them from the Products Page
3. Add Items to Cart and Remove Them from the Checkout Page
4. Add Items to Cart and Remove Them from the Product Details Page
5. Buy Items
6. Add Items to Cart, Logout, and Login Again to Verify Cart Persistence
7. Verify All Sorting Options on Products Page

Each test case is tagged appropriately for selective execution.

## Configuration
- Test data (email and password) is stored in the `logincredentials.json` file.

## Running the Tests
To run all tests:
To run tests with specific tags:

## Reporting
Test results are captured using Extent Report. After test execution, you can find the report in the `extent reports` directory.

## Challenges faced during automation
A significant hurdle encountered during the automation process was the integration of Selenium Grid. As this was a new area for me, I dedicated several hours to the task. Unfortunately, due to time limitations, I was unable to successfully implement Selenium Grid and had to prioritize other aspects of the assignment.
