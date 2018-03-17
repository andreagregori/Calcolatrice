package com.example.studente.calcolatrice20;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPiu, buttonMeno, buttonDivisione, buttonPer, buttonUguale, buttonCancella, buttonMpiu, buttonM;
    private boolean p=false, m=false, mol=false, div=false, ris=false;
    private TextView editText, editText2;
    private double x, y ,mem;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elementiGrafici();
        sp = getSharedPreferences("memoria", MODE_PRIVATE);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==button0.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "0");
        }

        if (v.getId()==button1.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "1");
        }

        if (v.getId()==button2.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "2");
        }

        if (v.getId()==button3.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "3");
        }

        if (v.getId()==button4.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "4");
        }

        if (v.getId()==button5.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "5");
        }

        if (v.getId()==button6.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "6");
        }

        if (v.getId()==button7.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "7");
        }

        if (v.getId()==button8.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "8");
        }

        if (v.getId()==button9.getId()){
            if (ris == true) {
                editText.setText("");
                editText2.setText("");
                ris=false;
            }
            editText.setText(editText.getText() + "9");
        }

        if (v.getId()==buttonPiu.getId()){
            x = Double.parseDouble(editText.getText() + "");
            p = true;
            editText2.setText("+");
            editText.setText("");
        }

        if (v.getId()==buttonMeno.getId()){
            x = Double.parseDouble(editText.getText() + "");
            m = true;
            editText2.setText("-");
            editText.setText("");
        }

        if (v.getId()==buttonDivisione.getId()){
            x = Double.parseDouble(editText.getText() + "");
            div = true;
            editText2.setText("/");
            editText.setText("");
        }

        if (v.getId()==buttonPer.getId()){
            x = Double.parseDouble(editText.getText() + "");
            mol = true;
            editText2.setText("*");
            editText.setText("");
        }

        if (v.getId()==buttonUguale.getId()){
            y = Double.parseDouble(editText.getText() + "");
            editText2.setText("=");
            ris=true;

            if (p == true){
                editText.setText(x + y + "");
                p=false;
            }

            if (m == true){
                editText.setText(x - y + "");
                m=false;
            }

            if (mol == true){
                editText.setText(x * y + "");
                mol=false;
            }

            if (div == true){
                double z=x/y;
                editText.setText(z + "");
                div=false;
            }
        }

        if (v.getId()==buttonM.getId()){
            editText.setText(sp.getInt("mem", 0) + "");
        }

        if (v.getId()==buttonMpiu.getId()){
            SharedPreferences.Editor editor = getSharedPreferences("memoria", MODE_PRIVATE).edit();
            editor.putInt("mem", Integer.parseInt(editText.getText() + ""));
            editor.apply();
            Toast t=  Toast.makeText(getApplicationContext(),"M memorizzato", Toast.LENGTH_SHORT);
            t.show();
        }

        if (v.getId()==buttonCancella.getId()){
            editText.setText("");
            editText2.setText("");
            p=false;
            m=false;
            mol=false;
            div=false;
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
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
    }
}