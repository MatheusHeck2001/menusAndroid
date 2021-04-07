package com.example.atividade4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.i("Life cycle: ", "OnCreate (main)...");

        ImageView furia = (ImageView) findViewById(R.id.furiaImg);
        furia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Furia.class);
                startActivity(intent);
            }
        });

        ImageView mibr = (ImageView) findViewById(R.id.mibrImg);
        mibr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mibr.class);
                startActivity(intent);
            }
        });

        ImageView teamOne = (ImageView) findViewById(R.id.t1Img);
        teamOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hltv.org/team/6947/teamone"));
                startActivity(it);
            }
        });

        ImageView liquid = (ImageView) findViewById(R.id.liquidImg);
        liquid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hltv.org/team/5973/liquid"));
                startActivity(it);
            }
        });

        ImageView godsent = (ImageView) findViewById(R.id.godsentImg);
        godsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hltv.org/team/6902/godsent"));
                startActivity(it);
            }
        });




        FloatingActionButton share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String texto = "BR CS latest news! Download here: https://google.com";
                sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title = item.getTitle().toString();
        Toast.makeText(getBaseContext(), title, Toast.LENGTH_SHORT).show();
        Intent myIntent = null;
        switch (item.getItemId()) {
            case R.id.mibr: {
                Intent intent = new Intent(MainActivity.this, Mibr.class);
                startActivity(intent);
                return true;

            }
            case R.id.furia: {
                Intent intent = new Intent(MainActivity.this, Furia.class);
                startActivity(intent);
                return true;
            }
            case R.id.hltv:{
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hltv.org/"));
                startActivity(it);
                return true;
            }
            case R.id.godsent: {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hltv.org/team/6902/godsent"));
                startActivity(it);
                return true;
            }
            case R.id.liquid: {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hltv.org/team/5973/liquid"));
                startActivity(it);
                return true;
            }

            case R.id.teamOne: {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hltv.org/team/6947/teamone"));
                startActivity(it);
                return true;
            }

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Life cycle: ", "On Pause (main)...");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Life cycle: ", "On Stop (main)...");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Life cycle: ", "On Destroy (main)...");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Life cycle: ", "On Resume (main)...");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Life cycle: ", "On Start (main)...");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Life cycle: ", "On Restart (main)...");
    }
}