package com.example.tomi.smokefreefinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class dataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
    }
    public void startProgram(View view){
        Intent start = new Intent(this, pula_activity.class);
        startActivity(start);
    }
}
