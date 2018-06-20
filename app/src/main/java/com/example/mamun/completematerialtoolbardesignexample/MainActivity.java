package com.example.mamun.completematerialtoolbardesignexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relative_main);

        switch (item.getItemId()){
            case R.id.item1_id:
                relativeLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.item2_id:
                relativeLayout.setBackgroundColor(Color.GREEN);
                return true;


        }



        return super.onOptionsItemSelected(item);
    }
}
