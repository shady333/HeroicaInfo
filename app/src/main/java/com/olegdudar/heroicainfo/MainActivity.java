package com.olegdudar.heroicainfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button openWorld;
    private Button openHeroes;
    private Button openRules;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        openHeroes = (Button) findViewById(R.id.btn_heroes);
        openRules = (Button) findViewById(R.id.btn_rules);
        openWorld = (Button) findViewById(R.id.btn_world);
    }

    public void openHeroes(View view){
        intent = new Intent(this, HeroesActivity.class);
        startActivity(intent);
    }

    public void openRules(View view){
        intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
    }

    public void openWorls(View view){
        intent = new Intent(this, WorldActivity.class);
        startActivity(intent);
    }
}
