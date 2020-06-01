package com.example.bigorsmall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    public void guess(View view)
    {
        EditText guess =(EditText) findViewById(R.id.guess);
        String guessedNumberString = guess.getText().toString();
        int guessedNumber = Integer.parseInt(guessedNumberString);
        String message ="";
        if(n>guessedNumber)
            message="TOO LOW";
        else
        if(n<guessedNumber)
            message="TOO HIGH";
        else
            message="WELL DONE";
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        n = r.nextInt(100);

    }
}
