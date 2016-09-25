package com.example.dian.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public String str ="";
    Character op = 'q';
    double i,num,numtemp;
    Button dot;
    EditText showResult;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (EditText)findViewById(R.id.result_id);
        dot = (Button) findViewById(R.id.dot);
    }
    public void btn1Clicked(View v){
        insert(1);
    }
    public void btn2Clicked(View v){
        insert(2);
    }
    public void btn3Clicked(View v){
        insert(3);
    }
    public void btn4Clicked(View v){
        insert(4);
    }
    public void btn5Clicked(View v){
        insert(5);
    }
    public void btn6Clicked(View v){
        insert(6);
    }
    public void btn7Clicked(View v){
        insert(7);
    }
    public void btn8Clicked(View v){
        insert(8);
    }
    public void btn9Clicked(View v){
        insert(9);
    }
    public void btnplusClicked(View v){
        perform();
        op = '+';
    }

    public void btnminusClicked(View v){
        perform();
        op = '-';
    }
    public void btndivideClicked(View v){
        perform();
        op = '/';
    }
    public void power(View v){
        perform();
        op = '^';
        calculate();
    }
    public void btnpercent(View v){
        perform();
        op = '%';
        calculate();
    }
    public void btnsqrt(View v){
        perform();
        op = 's';
        calculate();
    }
    public void btnmultiClicked(View v){
        perform();
        op = '*';
    }
    public void backspace(View v) {
        if (str.length() > 1) {
            String text = showResult.getText().toString();
            showResult.setText(text.substring(0, text.length() - 1));
            showResult.setSelection(showResult.getText().length());
        }
        else {
            reset();
        }
    }

    public void btnequalClicked(View v){
        calculate();
    }
    public void btnclearClicked(View v){
        reset();
    }
    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);
    }
    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        calculateNoShow();
        numtemp = num;
    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '^')
            num = (double) Math.pow(num, 2);
        else if(op == 's')
            num = (double) Math.sqrt(num);
        else if(op == '%')
            num = num/100;
        else if(op == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }

    private void calculateNoShow() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        else if(op == '^')
            num = (double) Math.pow(num, 2);
        else if(op == 's')
            num = (double) Math.sqrt(num);
        else if(op == '%')
            num = num/100;
        else if(op == '*')
            num = numtemp*num;
    }
}