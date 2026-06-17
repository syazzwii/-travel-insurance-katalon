# Airline Travel Insurance Automation (Katalon Studio)

## Project Overview

This project is an automation testing proof-of-concept (POC) for validating an airline flight booking flow with travel insurance integration.

The automation simulates a real-world airline booking journey using the BlazeDemo application to demonstrate end-to-end functional testing, UI validation, and automation framework design.

---

## Test Case Documentation

All manual test cases are stored in:

/docs/Airline_Travel_Insurance_Test_Cases.pdf

This document contains:
- Functional test cases
- Negative test cases
- Integration test cases
- Cross-browser test cases

## Application Under Test

**BlazeDemo (Demo Flight Booking Application)**  
https://blazedemo.com

> BlazeDemo is used as a simulation of real airline booking systems such as AirAsia, MAS or other airline portals due to restrictions on production environments (payment security, CAPTCHA and authentication controls).

---

## Objective

To verify that a flight booking system works correctly end-to-end, including:

- Flight search functionality
- Flight selection process
- Passenger information entry
- Booking confirmation
- Travel insurance flow simulation (conceptual mapping)

---

## Automation Scope

### Included:
- Flight search
- Flight selection
- Passenger details entry
- Booking confirmation validation
- UI element verification

### Excluded:
- Real payment gateway processing
- Production airline systems
- External insurance provider APIs

---

## Automated Test Scenario

### End-to-End Flight Booking Flow

1. Launch application
2. Select departure and destination cities
3. Search available flights
4. Choose a flight
5. Enter passenger details
6. Proceed to purchase
7. Validate booking confirmation message

---

## Business Mapping

| BlazeDemo Flow              | Real Airline System Equivalent      |
|----------------------------|-------------------------------------|
| Flight selection           | Airline ticket selection            |
| Passenger details entry    | Customer booking information        |
| Purchase flow              | Payment processing                  |
| Confirmation page          | Booking + insurance confirmation    |

---

## Tools & Technologies

- Katalon Studio
- Selenium WebDriver
- Groovy scripting
- Test Object Repository
- Test Suites execution
- Git & GitHub version control

---

## Framework Structure

```text
TravelInsuranceAutomation/
│
├── Test Cases/
├── Object Repository/
├── Test Suites/
├── Scripts/
├── Include/
├── Profiles/
├── Reports/
├── project.prj
└── README.md

