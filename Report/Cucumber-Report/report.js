$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/org/Adactin_Features/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Applications",
  "description": "",
  "id": "hotel-booking-in-adactin-applications",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Lanuch The Applications",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button And It Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-applications;login-page;;1"
    },
    {
      "cells": [
        "Advija",
        "Advi@123"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-applications;login-page;;2"
    },
    {
      "cells": [
        "Alpha",
        "Alpha@123"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-applications;login-page;;3"
    },
    {
      "cells": [
        "vinilakumar",
        "vinila@123"
      ],
      "line": 16,
      "id": "hotel-booking-in-adactin-applications;login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 103177400,
  "status": "passed"
});
formatter.before({
  "duration": 408400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Lanuch The Applications",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Advija\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"Advi@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button And It Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def.user_Lanuch_The_Applications()"
});
formatter.result({
  "duration": 7763366100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Advija",
      "offset": 16
    }
  ],
  "location": "Step_def.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 1133319200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Advi@123",
      "offset": 16
    }
  ],
  "location": "Step_def.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 408905200,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.use_Click_The_Login_Button_And_It_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1893780400,
  "status": "passed"
});
formatter.before({
  "duration": 181300,
  "status": "passed"
});
formatter.before({
  "duration": 143100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Lanuch The Applications",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Alpha\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"Alpha@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button And It Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def.user_Lanuch_The_Applications()"
});
formatter.result({
  "duration": 2366037200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alpha",
      "offset": 16
    }
  ],
  "location": "Step_def.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 297907600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alpha@123",
      "offset": 16
    }
  ],
  "location": "Step_def.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 275103700,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.use_Click_The_Login_Button_And_It_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1044423700,
  "status": "passed"
});
formatter.before({
  "duration": 397400,
  "status": "passed"
});
formatter.before({
  "duration": 120600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Lanuch The Applications",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"vinilakumar\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"vinila@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button And It Navigate To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def.user_Lanuch_The_Applications()"
});
formatter.result({
  "duration": 1043133500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinilakumar",
      "offset": 16
    }
  ],
  "location": "Step_def.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 258188000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinila@123",
      "offset": 16
    }
  ],
  "location": "Step_def.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 259780700,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.use_Click_The_Login_Button_And_It_Navigate_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 2852759100,
  "status": "passed"
});
formatter.before({
  "duration": 120600,
  "status": "passed"
});
formatter.before({
  "duration": 221800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user Select The Hotel Location",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Select \"Hotel Hervey\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select Number of Numbers",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Enter The Check IN Date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Select Adult Room",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User Select Child Room",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Click Search a Hotel And Navigate To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def.user_Select_The_Hotel_Location()"
});
formatter.result({
  "duration": 1666180900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Hervey",
      "offset": 13
    }
  ],
  "location": "Step_def.user_Select_(String)"
});
formatter.result({
  "duration": 314933000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Select_Room_Type()"
});
formatter.result({
  "duration": 449102400,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Select_Number_of_Numbers()"
});
formatter.result({
  "duration": 368094300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Enter_The_Check_IN_Date()"
});
formatter.result({
  "duration": 1204720600,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Enter_The_Check_Out_Date()"
});
formatter.result({
  "duration": 385629500,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Select_Adult_Room()"
});
formatter.result({
  "duration": 322152300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Select_Child_Room()"
});
formatter.result({
  "duration": 169855300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Click_Search_a_Hotel_And_Navigate_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 5232090100,
  "status": "passed"
});
formatter.before({
  "duration": 366200,
  "status": "passed"
});
formatter.before({
  "duration": 153800,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user Click On The Radio Button Select Hotel On Given A List",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user Click A Continue Button And Navigate To Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def.user_Click_On_The_Radio_Button_Select_Hotel_On_Given_A_List()"
});
formatter.result({
  "duration": 188886000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Click_A_Continue_Button_And_Navigate_To_Book_Hotel_Page()"
});
formatter.result({
  "duration": 2691666900,
  "status": "passed"
});
formatter.before({
  "duration": 320600,
  "status": "passed"
});
formatter.before({
  "duration": 477900,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Book Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "user Enter A First Name On The Fname Field",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user Enter A Last Name On The Lname Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter A Address On The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Enter A Card Number In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Select A Card Type In Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Select A Exprie Month In Exp Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Select A Exprie Year In Exp Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user Enter A CVV No In CVV Field",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user Click A BooK Now Button And Its Navigate To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def.user_Enter_A_First_Name_On_The_Fname_Field()"
});
formatter.result({
  "duration": 318143000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Enter_A_Last_Name_On_The_Lname_Field()"
});
formatter.result({
  "duration": 395503900,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Enter_A_Address_On_The_Billing_Address_Field()"
});
formatter.result({
  "duration": 421209100,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Enter_A_Card_Number_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 321346800,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Select_A_Card_Type_In_Card_Type_Field()"
});
formatter.result({
  "duration": 365718300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Select_A_Exprie_Month_In_Exp_Month_Field()"
});
formatter.result({
  "duration": 255044300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Select_A_Exprie_Year_In_Exp_Year_Field()"
});
formatter.result({
  "duration": 192072300,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Enter_A_CVV_No_In_CVV_Field()"
});
formatter.result({
  "duration": 3272874000,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.user_Click_A_BooK_Now_Button_And_Its_Navigate_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 227659900,
  "status": "passed"
});
formatter.before({
  "duration": 130100,
  "status": "passed"
});
formatter.before({
  "duration": 126900,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Booking Confirmation",
  "description": "",
  "id": "hotel-booking-in-adactin-applications;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "user Click The My Itinerary Button And Navigate To Booked Itinerary Page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_def.user_Click_The_My_Itinerary_Button_And_Navigate_To_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 10839821200,
  "status": "passed"
});
});