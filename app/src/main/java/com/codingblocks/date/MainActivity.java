package com.codingblocks.date;

import android.icu.util.Calendar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView date, date1, date2, date3, date4, date5, date6;
    int dayofweek;
    String string = "",string1="",string2="",string3="",string4="",string5="",string6="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = findViewById(R.id.textview1);
        date1 = findViewById(R.id.textview2);
        date2 = findViewById(R.id.textview3);
        date3 = findViewById(R.id.textview4);
        date4 = findViewById(R.id.textview5);
        date5 = findViewById(R.id.textview6);
        date6 = findViewById(R.id.textview7);



        Calendar cin = null;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            cin = Calendar.getInstance();


            int day = cin.get(Calendar.DAY_OF_MONTH);
            int month = cin.get(Calendar.MONTH);
            int year = cin.get(Calendar.YEAR);
            dayofweek = cin.get(Calendar.DAY_OF_WEEK);
            switch (dayofweek) {
                case Calendar.SUNDAY:
                    string = day + "/" + (month + 1) + "/" + year + "sunday";
                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (day) == 31) {
                        day = 1;
                        month += 2;
                        string1 = " " + day + month + year + "monday";
                    } else if (month + 1 == 12 && day == 31) {
                        day = 1;
                        month = 1;
                        year += 1;
                        string1 = " " + day + month + year + "monday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (day) == 30) {
                        day = 1;
                        month += 2;
                        string1 = " " + day + month + year + "monday";
                    } else if (month + 1 == 2 && day == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 2;
                        string1 = day + month + year + "monday";
                    } else {
                        string1 = day + month + year + "monday";
                    }
                    break;
                case Calendar.MONDAY:
                    string = day + "/" + (month + 1) + "/" + year + "monday";
                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (day) == 31) {
                        day = 1;
                        month += 2;
                        string1 = " " + day + month + year + "tuesday";
                    } else if (month + 1 == 12 && day == 31) {
                        day = 1;
                        month = 1;
                        year += 1;
                        string1 = " " + day + month + year + "tuesday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (day) == 30) {
                        day = 1;
                        month += 2;
                        string1 = " " + day + month + year + "tuesday";
                    } else if (month + 1 == 2 && day == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 2;
                        string1 = day + month + year + "tuesday";
                    } else {
                        string1 = day + month + year + "tuesday";
                    }
                    break;
                case Calendar.TUESDAY:
                    string = day + "/" + (month + 1) + "/" + year + "tuesday";
                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (day) == 31) {
                        day = 1;
                        month += 2;
                        string1 = " " + day + month + year + "wednesday";
                    } else if (month + 1 == 12 && day == 31) {
                        day = 1;
                        month = 1;
                        year += 1;
                        string1 = " " + day + month + year + "wednesday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (day) == 30) {
                        day = 1;
                        month += 2;
                        string1 = " " + day + month + year + "wednesday";
                    } else if (month + 1 == 2 && day == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 2;
                        string1 = day + month + year + "wednesday";
                    } else {
                        string1 = day + month + year + "wednesday";
                    }
                    break;
                case Calendar.WEDNESDAY:
                    int d = day;
                    string = day + "/" + (month + 1) + "/" + year + "wednesday";
                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (day) == 31) {
                        day = 1;
                        month += 1;
                        string1 = day + "/" + (month + 1) + "/" + year + "thursday";
                    } else if (month + 1 == 12 && day == 31) {
                        day = 1;
                        month = 0;
                        year += 1;
                        string1 = day + "/" + (month + 1) + "/" + year + "thursday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (day) == 30) {
                        day = 1;
                        month += 1;
                        string1 = day + "/" + (month + 1) + "/" + year + "thursday";
                    } else if (month + 1 == 2 && day == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 1;
                        string1 = day + "/" + (month + 1) + "/" + year + "thursday";
                    } else {
                        day = day + 1;
                        string1 = day + "/" + (month + 1) + "/" + year + "thursday";
                    }

                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (d + 1) == 31) {
                        day = 1;
                        month += 1;
                        string2 = day + "/" + (month + 1) + "/" + year + "friday";
                    } else if (month + 1 == 12 && d + 1 == 31) {
                        day = 1;
                        month = 0;
                        year += 1;
                        string2 = day + "/" + (month + 1) + "/" + year + "friday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (d + 1) == 30) {
                        day = 1;
                        month += 1;
                        string2 = day + "/" + (month + 1) + "/" + year + "friday";
                    } else if (month + 1 == 2 && d + 1 == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 1;
                        string2 = day + "/" + (month + 1) + "/" + year + "friday";
                    } else {
                        day = day + 1;
                        string2 = day + "/" + (month + 1) + "/" + year + "friday";
                    }

                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (d + 2) == 31) {
                        day = 1;
                        month += 1;
                        string3 = day + "/" + (month + 1) + "/" + year + "saturday";
                    } else if (month + 1 == 12 && d + 2 == 31) {
                        day = 1;
                        month = 0;
                        year += 1;
                        string3 = day + "/" + (month + 1) + "/" + year + "saturday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (d + 2) == 30) {
                        day = 1;
                        month += 1;
                        string3 = day + "/" + (month + 1) + "/" + year + "saturday";
                    } else if (month + 1 == 2 && d + 2 == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 1;
                        string3 = day + "/" + (month + 1) + "/" + year + "saturday";
                    } else {
                        day = day + 1;
                        string3 = day + "/" + (month + 1) + "/" + year + "saturday";
                    }
                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (d + 3) == 31) {
                        day = 1;
                        month += 1;
                        string4 = day + "/" + (month + 1) + "/" + year + "sunday";
                    } else if (month + 1 == 12 && d + 3 == 31) {
                        day = 1;
                        month = 0;
                        year += 1;
                        string4 = day + "/" + (month + 1) + "/" + year + "sunday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (d + 3) == 30) {
                        day = 1;
                        month += 1;
                        string4 = day + "/" + (month + 1) + "/" + year + "sunday";
                    } else if (month + 1 == 2 && d + 3 == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 1;
                        string4 = day + "/" + (month + 1) + "/" + year + "sunday";
                    } else {
                        day = day + 1;
                        string4 = day + "/" + (month + 1) + "/" + year + "sunday";
                    }

                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (d + 4) == 31) {
                        day = 1;
                        month += 1;
                        string5 = day + "/" + (month + 1) + "/" + year + "monday";
                    } else if (month + 1 == 12 && d + 4 == 31) {
                        day = 1;
                        month = 1;
                        year += 1;
                        string5 = day + "/" + (month + 1) + "/" + year + "monday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (d + 4) == 30) {
                        day = 1;
                        month += 1;
                        string5 = day + "/" + (month + 1) + "/" + year + "monday";
                    } else if (month + 1 == 2 && d + 4 == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 1;
                        string5 = day + "/" + (month + 1) + "/" + year + "monday";
                    } else {
                        day = day + 1;
                        string5 = day + "/" + (month + 1) + "/" + year + "monday";
                    }

                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (d + 5) == 31) {
                        day = 1;
                        month += 1;
                        string6 = day + "/" + (month + 1) + "/" + year + "tuesday";
                    } else if (month + 1 == 12 && d + 5 == 31) {
                        day = 1;
                        month = 0;
                        year += 1;
                        string6 = day + "/" + (month + 1) + "/" + year + "tuesday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (d + 5) == 30) {
                        day = 1;
                        month += 1;
                        string6 = day + "/" + (month + 1) + "/" + year + "tuesday";
                    } else if (month + 1 == 2 && d + 5 == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 1;
                        string6 = day + "/" + (month + 1) + "/" + year + "tuesday";
                    } else {
                        day = day + 1;
                        string6 = day + "/" + (month + 1) + "/" + year + "tuesday";
                    }


                    break;
                case Calendar.THURSDAY:
                    string = day + "/" + (month + 1) + "/" + year + "thursday";
                    if ((month + 1 == 1 || month + 1 == 3 || month + 1 == 5 || month + 1 == 7 || month + 1 == 8 || month + 1 == 10) && (day) == 31) {
                        day = 1;
                        month += 2;
                        string1 = " " + day + month + year + "tuesday";
                    } else if (month + 1 == 12 && day == 31) {
                        day = 1;
                        month = 1;
                        year += 1;
                        string1 = " " + day + month + year + "friday";
                    } else if ((month + 1 == 4 || month + 1 == 6 || month + 1 == 9 || month + 1 == 11) && (day) == 30) {
                        day = 1;
                        month += 2;
                        string1 = " " + day + month + year + "friday";
                    } else if (month + 1 == 2 && day == 28 && (year % 4 != 0)) {
                        day = 1;
                        month += 2;
                        string1 = day + month + year + "friday";
                    } else {
                        day = day + 1;
                        string1 = day + (month + 1) + year + "friday";
                    }
                    break;
                case Calendar.FRIDAY:
                    string = day + "/" + (month + 1) + "/" + year + "friday";
                    break;
                case Calendar.SATURDAY:
                    string = day + "/" + (month + 1) + "/" + year + "saturday";
                    break;
            }

            }
            date.setText(string);
            date1.setText(string1);
            date2.setText(string2);
            date3.setText(string3);
            date4.setText(string4);
            date5.setText(string5);
            date6.setText(string6);




    }
}