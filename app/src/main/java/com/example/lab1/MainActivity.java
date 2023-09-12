package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.w("DEBUG:", "MainActivity onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        Button btn_to_web = (Button) findViewById(R.id.btn_to_web);
        btn_to_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://developer.android.com/develop/ui/views/layout/linear"));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.w("MyApp", "MainActivity onStart() called");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.w("MyApp", "MainActivity onResume() called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.w("MyApp", "MainActivity onPause() called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.w("MyApp", "MainActivity onStop() called");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.w("MyApp", "MainActivity onRestart() called");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.w("MyApp", "MainActivity onDestroy() called");
        super.onDestroy();
    }
}