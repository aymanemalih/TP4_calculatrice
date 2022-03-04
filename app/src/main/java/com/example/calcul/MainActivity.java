package com.example.calcul;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    String txt = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button0 = findViewById(R.id.button0);
        Button cleanAll = findViewById(R.id.cleanALL);
        Button addition = findViewById(R.id.addition);
        Button sous = findViewById(R.id.sous);
        Button produit = findViewById(R.id.produit);
        Button div = findViewById(R.id.div);
        Button egale = findViewById(R.id.egale);
        Button percent = findViewById(R.id.percent);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        cleanAll.setOnClickListener(this);
        sous.setOnClickListener(this);
        produit.setOnClickListener(this);
        div.setOnClickListener(this);
        addition.setOnClickListener(this);
        egale.setOnClickListener(this);
        egale.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView txtView = (TextView) findViewById(R.id.textView3);
        TextView result = findViewById(R.id.textView4);
        switch (v.getId()) {
            case R.id.button1:
                this.txt += "1";
                txtView.setText(this.txt);
                break;
            case R.id.button2:
                this.txt += "2";
                txtView.setText(this.txt);
                break;
            case R.id.button3:
                this.txt += "3";
                txtView.setText(this.txt);
                break;
            case R.id.button4:
                this.txt += "4";
                txtView.setText(this.txt);
                break;
            case R.id.button5:
                this.txt += "5";
                txtView.setText(this.txt);
                break;
            case R.id.button6:
                this.txt += "6";
                txtView.setText(this.txt);
                break;
            case R.id.button7:
                this.txt += "7";
                txtView.setText(this.txt);
                break;
            case R.id.button8:
                this.txt += "8";
                txtView.setText(this.txt);
                break;
            case R.id.button9:
                this.txt += "9";
                txtView.setText(this.txt);
                break;
            case R.id.button0:
                this.txt += "0";
                txtView.setText(this.txt);
                break;
            case R.id.addition:
                this.txt += "+";
                txtView.setText(this.txt);
                break;
            case R.id.percent:
                this.txt += "%";
                txtView.setText(this.txt);
                break;
            case R.id.produit:
                this.txt += "*";
                txtView.setText(this.txt);
                break;
            case R.id.div:
                this.txt += "/";
                txtView.setText(this.txt);
                break;
            case R.id.sous:
                this.txt += "-";
                txtView.setText(this.txt);
                break;
            case R.id.cleanALL:
                txtView.setText("");
                this.txt = "";
            case R.id.egale:
                Expression exp = new ExpressionBuilder(txt).build();
                result.setText(Double.toString(exp.evaluate()));
                txtView.setText(this.txt);
                break;

        }


    }
}