package com.example.tomi.smokefreefinal;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.tomi.smokefreefinal.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startButton(View view){
        Intent intent = new Intent(this, dataActivity.class);
        startActivity(intent);
    }

}
