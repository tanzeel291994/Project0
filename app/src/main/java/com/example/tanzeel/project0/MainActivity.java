package com.example.tanzeel.project0;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    String s1="This button will launch my stopify streamer";
    String s2="This button will launch my football app";
    String s3="This button will launch my library app";
    String s4="This button will launch my build it bigger app";
    String s5="This button will launch my XYZ reader app";
    String s6="This button will launch my capstone app";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),s1, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),s2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),s3, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),s4, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),s5, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),s6, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }


}
