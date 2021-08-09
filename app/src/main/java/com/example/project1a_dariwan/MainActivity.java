package com.example.project1a_dariwan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText textnama;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textnama = (EditText)findViewById(R.id.inputnama);
        hasil = (TextView)findViewById(R.id.hasilAkhir);

        Button tampilkan = (Button)findViewById(R.id.btn1);
        tampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText("Nama Anda : "+textnama.getText());
            }
        });
    }
}