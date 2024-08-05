package com.example.datepicker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText etTanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load(){

        etTanggal = findViewById(R.id.etTanggal);
    }

    public void etTanggal(View view) {

        Calendar cal = Calendar.getInstance();
        int tgl = cal.get((Calendar.DAY_OF_MONTH));
        int bln = cal.get((Calendar.MONTH));
        int thn = cal.get((Calendar.YEAR));

        DatePickerDialog dtp = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int thn, int bln, int tgl) {
                etTanggal.setText(tgl+"-"+(bln+1)+"-"+thn);

            }
        }, thn, bln, tgl);

        dtp.show();
    }
}
