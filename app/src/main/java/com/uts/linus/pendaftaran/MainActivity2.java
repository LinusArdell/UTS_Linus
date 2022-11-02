package com.uts.linus.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvNama, tvNomor, tvSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Konfirmasi Pendaftaran");

        tvNama = findViewById(R.id.tv_nama);
        tvNomor = findViewById(R.id.tv_nomor_pendaftaran);
        tvSpinner = findViewById(R.id.tv_spin);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("nama");
        String yNomor = terima.getStringExtra("nomor");
        String ySpin = terima.getStringExtra("spin");

        tvNama.setText(yNama);
        tvNomor.setText(yNomor);
        tvSpinner.setText(ySpin);
    }
}