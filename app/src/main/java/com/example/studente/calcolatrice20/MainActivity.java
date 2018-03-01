package com.example.studente.calcolatrice20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonPiu;
    private Button buttonMeno;
    private Button buttonDivisione;
    private Button buttonPer;
    private Button buttonUguale;
    private Button buttonCancella;
    private Button buttonMpiu;
    private Button buttonM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elementiGrafici();

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==button0.getId()){
            Toast t=  Toast.makeText(getApplicationContext(),"0",Toast.LENGTH_SHORT);
            t.show();
        }
    }

    public void elementiGrafici(){
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);
        buttonUguale = findViewById(R.id.buttonUguale);
        buttonUguale.setOnClickListener(this);
        buttonPiu = findViewById(R.id.buttonPiu);
        buttonPiu.setOnClickListener(this);
        buttonMeno = findViewById(R.id.buttonMeno);
        buttonMeno.setOnClickListener(this);
        buttonDivisione = findViewById(R.id.buttonDivisione);
        buttonDivisione.setOnClickListener(this);
        buttonPer = findViewById(R.id.buttonPer);
        buttonPer.setOnClickListener(this);
        buttonCancella = findViewById(R.id.buttonCancella);
        buttonCancella.setOnClickListener(this);
        buttonMpiu = findViewById(R.id.buttonMemoriaPiu);
        buttonMpiu.setOnClickListener(this);
        buttonM = findViewById(R.id.buttonMemoria);
        buttonM.setOnClickListener(this);
    }
}