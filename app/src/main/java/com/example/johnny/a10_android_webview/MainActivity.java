package com.example.johnny.a10_android_webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUrl = (EditText) findViewById(R.id.txtUrl);
    }


    public void abrirPagina(View view) {

        String url = txtUrl.getText().toString();

        Intent intent = new Intent(this, MenuActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
