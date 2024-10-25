package com.example.app18km;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.ComponentActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ErrorLoginActivity extends ComponentActivity {
    private Button btnBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_login);
        btnBackToLogin = findViewById(R.id.btnBackToLogin);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnBackToLogin.setOnClickListener(view -> {
            Intent intent = new Intent(ErrorLoginActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
