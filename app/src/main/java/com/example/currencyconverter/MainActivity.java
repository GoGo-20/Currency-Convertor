package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view){
              EditText RuppesAmountEditText= (EditText) findViewById(R.id.RuppesAmountEditText);
              Double RuppesAmountDouble = Double.parseDouble(RuppesAmountEditText.getText().toString());
              Double dollarAmount = RuppesAmountDouble * 0.014;
              Toast.makeText(MainActivity.this, "$" + String.format("%.2f", dollarAmount), Toast.LENGTH_SHORT).show();
              Log.i("amount", RuppesAmountEditText.getText().toString());
          }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
