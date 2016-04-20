package com.example.yzx.mytopbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclik(View view){
        //Toast.makeText(this,"nimabi",Toast.LENGTH_LONG).show();
        startActivity(new Intent(MainActivity.this,MyTopBarTest.class));
    }
}
