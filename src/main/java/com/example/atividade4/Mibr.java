package com.example.atividade4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Mibr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibr);

        Log.i("Life cycle: ", "On Create (mibr activity)...");

        ImageView mibr = (ImageView) findViewById(R.id.mibrLogo);
        mibr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hltv.org/team/9215/mibr"));
                startActivity(it);
            }
        });

        FloatingActionButton share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                String texto = "MIBR latest news! Download here: https://google.com";
                sendIntent.putExtra(Intent.EXTRA_TEXT, texto);
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Life cycle: ", "On Pause (mibr activity)...");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Life cycle: ", "On Stop (mibr activity)...");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Life cycle: ", "On Destroy (mibr activity)...");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Life cycle: ", "On Resume (mibr activity)...");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Life cycle: ", "On Start (mibr activity)...");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Life cycle: ", "On Restart (mibr activity)...");
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
                Intent intent = new Intent(Mibr.this, Mibr.class);
                startActivity(intent);
                return true;

            }
            case R.id.furia: {
                Intent intent = new Intent(Mibr.this, Furia.class);
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
}