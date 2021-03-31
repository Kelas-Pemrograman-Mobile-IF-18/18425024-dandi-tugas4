package com.dandikurniawan.tugas4dandiintel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Halaman1 extends AppCompatActivity {


    @BindView(R.id.edtNama)
    EditText edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnPindah)
    void pindah(){
        String nama = edtNama.getText().toString();
        Intent i = new Intent(Halaman1.this, Halaman2.class);
        i.putExtra("nama", nama);
        startActivity(i);
        finish();
    }
}