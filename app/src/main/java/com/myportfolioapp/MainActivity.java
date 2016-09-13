package com.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickPopularMovies = (Button)findViewById(R.id.popularMovies);
        clickPopularMovies.setOnClickListener(this);

        Button clickStockHawk = (Button)findViewById(R.id.stockHawk);
        clickStockHawk.setOnClickListener(this);

        Button clickBuildItBigger = (Button)findViewById(R.id.buildItBigger);
        clickBuildItBigger.setOnClickListener(this);

        Button clickMakeYourAppMaterial = (Button)findViewById(R.id.makeYourAppMaterial);
        clickMakeYourAppMaterial.setOnClickListener(this);

        Button clickGoUbiquitous = (Button)findViewById(R.id.goUbiquitous);
        clickGoUbiquitous.setOnClickListener(this);

        Button clickCapstone = (Button)findViewById(R.id.capstone);
        clickCapstone.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.popularMovies:
                Toast.makeText(getApplicationContext(),"This button will launch Popular movies app!",Toast.LENGTH_SHORT).show();
                    break;
            case R.id.stockHawk:
                Toast.makeText(getApplicationContext(),"This app will launch Stock Hawk app!",Toast.LENGTH_SHORT).show();
                break;

            case R.id.buildItBigger:
                Toast.makeText(getApplicationContext(),"This app will launch Build it Bigger app!",Toast.LENGTH_SHORT).show();
                break;

            case R.id.makeYourAppMaterial:
                Toast.makeText(getApplicationContext(),"This app will launch Make your app Matreial app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.goUbiquitous:
            Toast.makeText(getApplicationContext(),"This app will launch Go Ubiquitous app!",Toast.LENGTH_SHORT).show();
            break;

            case R.id.capstone:
                Toast.makeText(getApplicationContext(),"This app will launch Capstone app!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
