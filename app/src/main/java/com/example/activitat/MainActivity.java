package com.example.activitat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //La m es una nomenclatura que se puede hacer servir o no
    private Button mButo1;
    private TextView mTextview1;
    private TextView mTextview2;
    private Button mButo2;
    private Button mButoPV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButo1 = findViewById(R.id.B1);
        mTextview1 = findViewById(R.id.T1);
        mButo2 = findViewById(R.id.B2);
        mTextview2 = findViewById(R.id.T2);
        mButoPV = findViewById(R.id.PV);

        mButo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("----","Hola");
                mTextview1.setText("Hola");
            }
        });
        mButo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextview1.setText("");
            }
        });

        mButoPV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String T1 = mTextview1.getText().toString();
                mTextview2.setText(T1);
            }
        });
        }
    }