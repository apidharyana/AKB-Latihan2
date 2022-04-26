package com.example.a10119245latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void btnVerify(View view){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}

/* Tanggal Pengerjaan 26 April 2022
   NIM   : 10119245
   Nama  : Apid Haryana
   Kelas : IF - 6
 */
