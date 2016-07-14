package com.example.candidosg.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button  = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my popular movies", duration);
                toast.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my stock hawk", duration);
                toast.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my build it bigger", duration);
                toast.show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my make your app material", duration);
                toast.show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my go ubiquitous", duration);
                toast.show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my go ubiquitous", duration);
                toast.show();
            }
        });
    }

}
