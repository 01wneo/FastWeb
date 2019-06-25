package app.zowneo.fastweb;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseAty {
    private EditText editText;
    private WebView webView;
    private Button button;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initWebSet();
        initDate();
    }

    private void initWebSet() {
        WebSettings ws = webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
    }

    private void initDate() {
        webView.loadUrl("http://www.baidu.com");
        text = editText.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(text);
            }
        });
    }

    private void initView() {
        editText = findViewById(R.id.editText);
        webView = findViewById(R.id.webView);
        button = findViewById(R.id.button);
    }
}
