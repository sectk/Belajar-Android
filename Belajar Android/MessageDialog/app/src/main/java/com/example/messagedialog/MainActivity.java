package com.example.messagedialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showToast(String pesan){
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
    }

    public void showAlert(String pesan){
        AlertDialog.Builder buatAlert = new AlertDialog.Builder(this);
        buatAlert.setTitle("PERHATIAN !");
        buatAlert.setMessage(pesan);

        buatAlert.show();
    }

    public void showAlertButton(String pesan){
        final AlertDialog.Builder showAlert = new AlertDialog.Builder(this);
        showAlert.setTitle("PERINGATAN !");
        showAlert.setMessage(pesan);

        showAlert.setPositiveButton("YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("Data sudah dihapus !");
            }
        });

        showAlert.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                showToast("Data tidak dihapus");
            }
        });

        showAlert.show();
    }


    public void btnToast(View view) {
        showToast("Selamat Belajar");
    }

    public void btnAlert(View view) {
        showAlert("Selamat Belajar !");
    }

    public void btnAlertDialogButton(View view) {

        showAlertButton("Yakin Akan Menghapus ?");
    }
}
