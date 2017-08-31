package com.xuxd.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    FloatingDraftButton floatingDraftButton;
    FloatingActionButton liveness;
    FloatingActionButton floatingActionButton2;
    FloatingActionButton floatingActionButton3;
    FloatingActionButton floatingActionButton4;
    FloatingActionButton floatingActionButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        floatingDraftButton = findViewById(R.id.floatingActionButton);
        liveness = findViewById(R.id.floatingActionButton_liveness);
        floatingDraftButton.registerButton(liveness);
        floatingActionButton2 = findViewById(R.id.floatingActionButton_2);
        floatingActionButton3 = findViewById(R.id.floatingActionButton_3);
        floatingActionButton4 = findViewById(R.id.floatingActionButton_4);
        floatingActionButton5 = findViewById(R.id.floatingActionButton_5);

        floatingDraftButton.registerButton(floatingActionButton2);
        floatingDraftButton.registerButton(floatingActionButton3);
        floatingDraftButton.registerButton(floatingActionButton4);
        floatingDraftButton.registerButton(floatingActionButton5);

        floatingDraftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                //弹出动态Button
                AnimationUtil.slideButtons(MainActivity.this,floatingDraftButton);
            }
        });

        liveness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {        //关闭动态Button
                 AnimationUtil.slideButtons(MainActivity.this,floatingDraftButton);
                 Toast.makeText(getApplicationContext(), "liveness", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
