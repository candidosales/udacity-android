package com.example.candidosg.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Context context = getApplicationContext();
    CharSequence text = "Hello toast!";
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
