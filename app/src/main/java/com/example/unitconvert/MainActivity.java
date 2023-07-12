package com.example.unitconvert;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] Items1 = {"KiloGram","KiloMetre","Litre","Gram","Metre","CentiMetre"};
    String[] Items2 = {"Gram","MiliGram","Metre","CentiMetre","MiliMetre","MiliLitre"};
    AutoCompleteTextView autoCompleteTextView1;
    AutoCompleteTextView autoCompleteTextView2;
    ArrayAdapter<String> Unit1;
    ArrayAdapter<String> Unit2;
    String item1, item2;
    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView1 = findViewById(R.id.u1);
        autoCompleteTextView2 = findViewById(R.id.u2);

        Unit1 = new ArrayAdapter<>(this, R.layout.items, Items1);
        Unit2 = new ArrayAdapter<>(this, R.layout.items2, Items2);

        autoCompleteTextView1.setAdapter(Unit1);
        autoCompleteTextView2.setAdapter(Unit2);

        autoCompleteTextView1.setOnItemClickListener((adapterView, view, i, l) -> item1 = adapterView.getItemAtPosition(i).toString());
        autoCompleteTextView2.setOnItemClickListener((adapterView, view, i, l) -> item2 = adapterView.getItemAtPosition(i).toString());

        input = (EditText) findViewById(R.id.editTextNumber);
        output = (TextView) findViewById(R.id.textView);
    }
    public void convert(View view){
        Float value = Float.parseFloat(input.getText().toString());
        Float result;
        if (item1.equals("KiloGram")){
            if (item2.equals("Gram")){
                result = value * 1000;
                output.setText(result.toString());
            }
            else if (item2.equals("MiliGram")){
                result = value * 1000000;
                output.setText(result.toString());
            }
            else {
                Toast.makeText(MainActivity.this, "Invalid Conversion !", Toast.LENGTH_SHORT).show();
            }
        }
        if (item1.equals("KiloMetre")){
            if (item2.equals("Metre")){
                result = value * 1000;
                output.setText(result.toString());
            }
            else if (item2.equals("CentiMetre")){
                result = value * 100000;
                output.setText(result.toString());
            }
            else if (item2.equals("MiliMetre")){
                result = value * 1000000;
                output.setText(result.toString());
            }
            else {
                Toast.makeText(MainActivity.this, "Invalid Conversion !", Toast.LENGTH_SHORT).show();
            }
        }
        if (item1.equals("Litre")){
            if (item2.equals("MiliLitre")){
                result = value * 1000;
                output.setText(result.toString());
            }
            else {
                Toast.makeText(MainActivity.this, "Invalid Conversion !", Toast.LENGTH_SHORT).show();
            }
        }
        if (item1.equals("Gram")){
            if(item2.equals("MiliGram")){
                result = value * 1000;
                output.setText(result.toString());
            }
            else {
                Toast.makeText(MainActivity.this, "Invalid Conversion !", Toast.LENGTH_SHORT).show();
            }
        }
        if (item1.equals("Metre")){
            if (item2.equals("Centimetre")){
                result = value * 100;
                output.setText(result.toString());
            }
            else if (item2.equals("MiliMetre")){
                result = value * 1000;
                output.setText(result.toString());
            }
            else {
                Toast.makeText(MainActivity.this, "Invalid Conversion !", Toast.LENGTH_SHORT).show();
            }
        }
        if (item1.equals("CentiMetre")){
            if (item2.equals("Milimetre")){
                result = value * 10;
                output.setText(result.toString());
            }
            else {
                Toast.makeText(MainActivity.this, "Invalid Conversion !", Toast.LENGTH_SHORT).show();
            }
        }

    }
}