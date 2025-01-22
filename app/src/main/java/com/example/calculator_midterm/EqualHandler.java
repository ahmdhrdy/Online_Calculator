package com.example.calculator_midterm;

import java.util.ArrayList;

import android.widget.TextView;

public class EqualHandler extends Handler{

    @Override
    public void handleIt(Object ... parameters) {

        MainActivity activity = (MainActivity) parameters[0];
        //declare Textviews from textViews pass from Calculator
        TextView inputTxt = (TextView) parameters[1];
        TextView solutionTxt = (TextView) parameters[2];

        solutionTxt.setText(inputTxt.getText().toString());
        inputTxt.setText("");
    }
}