package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.firstno);
        et2=(EditText) findViewById(R.id.secondno);
        ans=(TextView) findViewById((R.id.textView5));
    }
    public void add(View v){
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = i+j;
        ans.setText("Ans\n" +k);
    }
    public void subtract(View v){
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = i-j;
        ans.setText("Ans\n" +k);
    }
    public void multiply(View v){
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = i*j;
        ans.setText("Ans\n" +k);
    }
    public void divide(View v){
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = (double) i/j;
        ans.setText("Ans\n" +k);
    }
}