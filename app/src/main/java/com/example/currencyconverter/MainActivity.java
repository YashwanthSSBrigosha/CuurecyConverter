package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view){
        Log.i("info","button pressed");
        EditText editText=(EditText) findViewById(R.id.editTextNumberDecimal);
        String amtInPound=editText.getText().toString();
        Double amtInPoundDub=Double.parseDouble(amtInPound);
        Double amtInDollarsDub=amtInPoundDub*1.3;
        String amtInDollars=String.format("%.2f",amtInDollarsDub);
        Toast.makeText(this, amtInPound+" pound is "+amtInDollars+" Dollars ", Toast.LENGTH_LONG).show();    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}