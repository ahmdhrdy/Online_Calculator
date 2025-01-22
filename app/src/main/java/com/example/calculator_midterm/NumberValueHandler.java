package com.example.calculator_midterm;

import android.widget.TextView;

public class NumberValueHandler extends Handler{


    public void handleIt(Object ... parameters){

        String numberString = (String) parameters[0];
        TextView inputText = (TextView) parameters[1];

        String number = inputText.getText().toString();

        number = number.concat(numberString);
        inputText.setText(number);
    }

}