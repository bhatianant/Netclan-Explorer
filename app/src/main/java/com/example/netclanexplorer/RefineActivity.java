package com.example.netclanexplorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RefineActivity extends AppCompatActivity {
    Spinner spn;

ImageButton backbtn;
String select[];
Button save;

TextView vlidityStatus;
EditText StatusET;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Window window = getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.toolbar));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);


        save=findViewById(R.id.save);
        vlidityStatus = findViewById(R.id.validityStatus);
        StatusET = findViewById(R.id.statusRefine);
        spn = findViewById(R.id.spinner);
        select =getResources().getStringArray(R.array.select);
        ArrayAdapter<String> adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,select);
        spn.setAdapter(adapter);


        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




    }
}