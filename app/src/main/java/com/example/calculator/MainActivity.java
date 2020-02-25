package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayi1;
    EditText sayi2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1 = findViewById(R.id.tvSayi1);
        sayi2 = findViewById(R.id.tvSayi2);
        sonuc = findViewById(R.id.tvSonuc);
    }


    public void topla_onClick(View view) {
        //variables
        int n1 = Integer.parseInt(sayi1.getText().toString());
        int n2 = Integer.parseInt(sayi2.getText().toString());

        int result = n1 + n2;
        sonuc.setText("Result : " + result);
    }

    public void cikar_onClick(View view) {
        int n1 = Integer.parseInt(sayi1.getText().toString());
        int n2 = Integer.parseInt(sayi2.getText().toString());

        int result = n1 - n2;
        sonuc.setText("Result : " + result);
    }

    public void carp_onClick(View view) {
        int n1 = Integer.parseInt(sayi1.getText().toString());
        int n2 = Integer.parseInt(sayi2.getText().toString());

        int result = n1 * n2;
        sonuc.setText("Result : " + result);
    }

    public void bol_onClick(View view) {
        int n1 = Integer.parseInt(sayi1.getText().toString());
        int n2 = Integer.parseInt(sayi2.getText().toString());

        int result = n1 / n2;
        sonuc.setText("Result : " + result);
    }
}
