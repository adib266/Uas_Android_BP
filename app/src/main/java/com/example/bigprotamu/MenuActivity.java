package com.example.bigprotamu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.net.Uri;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MenuActivity extends AppCompatActivity {
    private Button btnrecap ,btndaftar ,btnscan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnrecap =findViewById(R.id.btnrecap);
        btndaftar =findViewById(R.id.btndaftar);
        btnscan =findViewById(R.id.btnscan);

        btnrecap.setOnClickListener(view -> {
//                Toast.makeText(getApplicationContext(),"aloo ini bantun 1",Toast.LENGTH_SHORT).show();
            Intent Intent =new Intent(getApplicationContext(), Login.class);
            startActivity(Intent);
        });
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent =new Intent(getApplicationContext(), Login.class);
                startActivity(Intent);

            }
        });
        btnscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Intent);

            }
        });
    }
}