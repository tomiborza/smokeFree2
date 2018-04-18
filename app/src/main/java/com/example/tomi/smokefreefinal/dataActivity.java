package com.example.tomi.smokefreefinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class dataActivity extends AppCompatActivity {
    int cig,yr,mnth,prce;
    EditText cigsinput;
    EditText yearinput;
    EditText monthinput;
    EditText priceinput;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        cigsinput = findViewById(R.id.cigsinput);
        yearinput = findViewById(R.id.yearinput);
        monthinput = findViewById(R.id.monthinput);
        priceinput = findViewById(R.id.priceinput);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cig = Integer.valueOf( cigsinput.getText().toString());
                yr = Integer.valueOf(yearinput.getText().toString());
                mnth = Integer.valueOf(monthinput.getText().toString());
                prce = Integer.valueOf(priceinput.getText().toString());
            }
        });
    }
    public void startProgram(View view){
        Intent start = new Intent(this, pula_activity.class);
        startActivity(start);
    }
}
