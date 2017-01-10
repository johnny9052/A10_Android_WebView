package com.example.johnny.a10_android_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MenuActivity extends AppCompatActivity {

    WebView pagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        pagina = (WebView) findViewById(R.id.wvPagina);

        Bundle bundle = getIntent().getExtras();
        pagina.loadUrl("http://" + bundle.getString("url"));
    }
}
