package com.example.webviewinanothoractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText url;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String webAddress=url.getText().toString();
                openWeb(webAddress);
            }
        });
    }

    private void openWeb(String webAddress) {
        Intent intent=new Intent(this,WebActivity.class);
        intent.putExtra("url",webAddress);
        startActivity(intent);
    }

    public void init(){
        url=findViewById(R.id.url);
        go=findViewById(R.id.go);
    }
}