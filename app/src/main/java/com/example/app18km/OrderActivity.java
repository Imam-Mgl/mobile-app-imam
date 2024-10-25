package com.example.app18km;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        EditText nameEditText = findViewById(R.id.nameEditText);
        TextView dateTextView = findViewById(R.id.dateTextView);
        TextView orderSummary = findViewById(R.id.orderTextView);
        TextView totalPriceTextView = findViewById(R.id.totalPriceTextView);
        EditText cashEditText = findViewById(R.id.cashEditText);
        Button btnCalculateChange = findViewById(R.id.btnCalculateChange);
        TextView changeTextView = findViewById(R.id.changeTextView);
        Button btnBack = findViewById(R.id.btnBack);

        // Set tanggal dan jam saat ini
        String currentDateAndTime = new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(new Date());
        dateTextView.setText(currentDateAndTime);

        int kopiCount = getIntent().getIntExtra("kopi_count", 0);
        int tehCount = getIntent().getIntExtra("teh_count", 0);
        int extrajossusuCount = getIntent().getIntExtra("extrajossusu_count", 0); // Menggunakan extrajossusuCount
        int susuCount = getIntent().getIntExtra("susu_count", 0);
        int coklatCount = getIntent().getIntExtra("coklat_count", 0);
        int esTehCount = getIntent().getIntExtra("es_teh_count", 0);
        int jerukCount = getIntent().getIntExtra("jeruk_count", 0);
        int kopiGulaArenCount = getIntent().getIntExtra("kopi_gula_aren_count", 0);
        int wedangCount = getIntent().getIntExtra("wedang_count", 0);
        int miloCount = getIntent().getIntExtra("milo_count", 0);

        // Harga per item (misalnya)
        int hargaKopi = 10000;
        int hargaTeh = 8000;
        int hargaExtrajossusu = 7000;
        int hargaSusu = 5000;
        int hargaCoklat = 10000;
        int hargaEsTeh = 6000;
        int hargaJeruk = 7000;
        int hargaKopiGulaAren = 15000;
        int hargaWedang = 9000;
        int hargaMilo = 7000;

        // Hitung total harga
        int totalPrice = (kopiCount * hargaKopi) +
                (tehCount * hargaTeh) +
                (extrajossusuCount * hargaExtrajossusu) +
                (susuCount * hargaSusu) +
                (coklatCount * hargaCoklat) +
                (esTehCount * hargaEsTeh) +
                (jerukCount * hargaJeruk) +
                (kopiGulaArenCount * hargaKopiGulaAren) +
                (wedangCount * hargaWedang) +
                (miloCount * hargaMilo);

        StringBuilder summary = new StringBuilder();
        summary.append("Pesanan Anda:\n");
        if (kopiCount > 0) summary.append("Kopi: ").append(kopiCount).append("\n");
        if (tehCount > 0) summary.append("Teh: ").append(tehCount).append("\n");
        if (extrajossusuCount > 0) summary.append("Extra Joss Susu: ").append(extrajossusuCount).append("\n"); // Menggunakan extrajossusuCount
        if (susuCount > 0) summary.append("Susu: ").append(susuCount).append("\n");
        if (coklatCount > 0) summary.append("Coklat: ").append(coklatCount).append("\n");
        if (esTehCount > 0) summary.append("Es Teh: ").append(esTehCount).append("\n");
        if (jerukCount > 0) summary.append("Jeruk: ").append(jerukCount).append("\n");
        if (kopiGulaArenCount > 0) summary.append("Kopi Gula Aren: ").append(kopiGulaArenCount).append("\n");
        if (wedangCount > 0) summary.append("Wedang: ").append(wedangCount).append("\n");
        if (miloCount > 0) summary.append("Milo: ").append(miloCount).append("\n");

        orderSummary.setText(summary.toString());
        totalPriceTextView.setText("Total Harga: Rp " + totalPrice);

        btnCalculateChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cashInput = cashEditText.getText().toString();
                if (!cashInput.isEmpty()) {
                    try {
                        int cash = Integer.parseInt(cashInput);
                        int change = cash - totalPrice;
                        changeTextView.setText("Kembalian: Rp " + change);
                    } catch (NumberFormatException e) {
                        changeTextView.setText("Input tidak valid.");
                    }
                } else {
                    changeTextView.setText("Silakan masukkan uang tunai.");
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Menutup aktivitas saat ini dan kembali ke aktivitas sebelumnya
            }
        });
    }
}
