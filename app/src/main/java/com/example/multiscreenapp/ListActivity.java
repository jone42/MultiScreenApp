package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        final Button buttomHome = (Button) findViewById(R.id.buttonHome);
        buttomHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonHomeClicked();
            }
        });
        final Button buttomAdd = (Button) findViewById(R.id.buttonAdd);
        buttomAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonAddClicked();
            }
        });
        final Button buttomHList = (Button) findViewById(R.id.buttonList);
        buttomHList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonListClicked();
            }
        });

        Intent intent = getIntent();
        if( intent != null )  {
            String message = intent.getStringExtra( "message" );
            TextView lParam = (TextView) findViewById(R.id.listParam);
            lParam.setText(message);
        }
    }


    private void buttonHomeClicked() {
        Intent intent = new Intent(this, MainActivity.class);
        String message = "Come from List!";
        intent.putExtra("message", message);
        startActivity(intent);
    }

    private void buttonAddClicked() {
        Intent intent = new Intent(this, AddActivity.class);
        String message = "Come from List!";
        intent.putExtra("message", message);
        startActivity(intent);
    }

    private void buttonListClicked() {
        Intent intent = new Intent(this, ListActivity.class);
        String message = "Come from List!";
        intent.putExtra("message", message);
        startActivity(intent);
    }
}
