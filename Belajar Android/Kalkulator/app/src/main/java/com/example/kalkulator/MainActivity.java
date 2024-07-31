package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvhasil;
    EditText etBil_1, etBil_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load(){
        tvhasil = findViewById(R.id.tvHasil);
        etBil_1 = findViewById(R.id.etBil_1);
        etBil_2 = findViewById(R.id.etBil_2);
    }


    public void btnJumlah(View view) {
        if (etBil_1.getText().toString().equals("") || etBil_2.getText().toString().equals("")){
            Toast.makeText(this, "Ada bilangan yang kosong", Toast.LENGTH_SHORT).show();
        }else {

            double bil_1 = Double.parseDouble(etBil_1.getText().toString());
            double bil_2 = Double.parseDouble(etBil_2.getText().toString());

            double hasil = bil_1 + bil_2;

            tvhasil.setText(hasil + "");
        }


    }
}
