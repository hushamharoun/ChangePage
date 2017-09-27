package com.example.buscis_c2_l9.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    public EditText EditT;
    public static final String EXTRA_MESSAGE = "com.example.buscis_c2_l9.myapplication";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)
    {
        Intent intent = new Intent (this, DisplayMessageActivity.class);
        EditT = (EditText) findViewById(R.id.EditT);
        String message = EditT.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}
