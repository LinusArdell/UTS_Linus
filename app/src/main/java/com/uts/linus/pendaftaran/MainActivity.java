package com.uts.linus.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etnama, etnomor;
    String nomorPendaftaran, nama, dropDown, checkbox;
    Button button_daftar;
    CheckBox konfirm;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Halaman Pendaftaran");

        etnama = findViewById(R.id.et_nama);
        etnomor = findViewById(R.id.et_nomor);
        button_daftar = findViewById(R.id.button);
        konfirm = findViewById(R.id.cb_konfirm);
        spinner = findViewById(R.id.sp_Jalur);

        button_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = etnama.getText().toString();
                nomorPendaftaran = etnomor.getText().toString();
                dropDown = spinner.getSelectedItem().toString();
                checkbox = konfirm.getText().toString();

                if (nama.trim().equals("")){
                    etnama.setError("Nama wajib diisi");
                }
                else if (nomorPendaftaran.trim().equals("")){
                    etnomor.setError("Nomor pendaftaran wajib diisi");
                }
                else if (dropDown.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Pilih Jalur pendaftaran", Toast.LENGTH_SHORT).show();
                }
                else if (!konfirm.isChecked()){
                    Toast.makeText(MainActivity.this, "Silahkan Konfirmasi Pendaftaran", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                    pindah.putExtra("nama", nama);
                    pindah.putExtra("nomor", nomorPendaftaran);
                    pindah.putExtra("spin", dropDown);
                    startActivity(pindah);
                }
            }
        });
    }
}