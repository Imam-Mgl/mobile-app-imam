package com.example.app18km;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private int kopiCount = 0;
    private int tehCount = 0;
    private int extrajossusuCount = 0;
    private int susuCount = 0;
    private int coklatCount = 0;
    private int esTehCount = 0;
    private int jerukCount = 0;
    private int kopiGulaArenCount = 0;
    private int wedangCount = 0;
    private int miloCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, OrderActivity.class);
                intent.putExtra("kopi_count", kopiCount);
                intent.putExtra("teh_count", tehCount);
                intent.putExtra("extrajossusu_count", extrajossusuCount);
                intent.putExtra("susu_count", susuCount);
                intent.putExtra("coklat_count", coklatCount);
                intent.putExtra("es_teh_count", esTehCount);
                intent.putExtra("jeruk_count", jerukCount);
                intent.putExtra("kopi_gula_aren_count", kopiGulaArenCount);
                intent.putExtra("wedang_count", wedangCount);
                intent.putExtra("milo_count", miloCount);
                startActivity(intent);
            }
        });

        Button btnAddKopi = findViewById(R.id.btnAddKopi);
        Button btnSubtractKopi = findViewById(R.id.btnSubtractKopi);
        TextView tvKopiCount = findViewById(R.id.tvKopiCount);

        btnAddKopi.setOnClickListener(v -> {
            kopiCount++;
            tvKopiCount.setText(String.valueOf(kopiCount));
        });

        btnSubtractKopi.setOnClickListener(v -> {
            if (kopiCount > 0) {
                kopiCount--;
                tvKopiCount.setText(String.valueOf(kopiCount));
            }
        });

        Button btnAddTeh = findViewById(R.id.btnAddTeh);
        Button btnSubtractTeh = findViewById(R.id.btnSubtractTeh);
        TextView tvTehCount = findViewById(R.id.tvTehCount);

        btnAddTeh.setOnClickListener(v -> {
            tehCount++;
            tvTehCount.setText(String.valueOf(tehCount));
        });

        btnSubtractTeh.setOnClickListener(v -> {
            if (tehCount > 0) {
                tehCount--;
                tvTehCount.setText(String.valueOf(tehCount));
            }
        });

        Button btnAddJus = findViewById(R.id.btnAddExtrajossusu);
        Button btnSubtractJus = findViewById(R.id.btnSubtractExtrajossusu);
        TextView tvExtrajossusuCount = findViewById(R.id.tvExtrajossusuCount);

        btnAddJus.setOnClickListener(v -> {
            extrajossusuCount++;
            tvExtrajossusuCount.setText(String.valueOf(extrajossusuCount));
        });

        btnSubtractJus.setOnClickListener(v -> {
            if (extrajossusuCount > 0) {
                extrajossusuCount--;
                tvExtrajossusuCount.setText(String.valueOf(extrajossusuCount));
            }
        });

        Button btnAddSusu = findViewById(R.id.btnAddSusu);
        Button btnSubtractSusu = findViewById(R.id.btnSubtractSusu);
        TextView tvSusuCount = findViewById(R.id.tvSusuCount);

        btnAddSusu.setOnClickListener(v -> {
            susuCount++;
            tvSusuCount.setText(String.valueOf(susuCount));
        });

        btnSubtractSusu.setOnClickListener(v -> {
            if (susuCount > 0) {
                susuCount--;
                tvSusuCount.setText(String.valueOf(susuCount));
            }
        });

        Button btnAddCoklat = findViewById(R.id.btnAddCoklat);
        Button btnSubtractCoklat = findViewById(R.id.btnSubtractCoklat);
        TextView tvCoklatCount = findViewById(R.id.tvCoklatCount);

        btnAddCoklat.setOnClickListener(v -> {
            coklatCount++;
            tvCoklatCount.setText(String.valueOf(coklatCount));
        });

        btnSubtractCoklat.setOnClickListener(v -> {
            if (coklatCount > 0) {
                coklatCount--;
                tvCoklatCount.setText(String.valueOf(coklatCount));
            }
        });

        Button btnAddEsTeh = findViewById(R.id.btnAddEsTeh);
        Button btnSubtractEsTeh = findViewById(R.id.btnSubtractEsTeh);
        TextView tvEsTehCount = findViewById(R.id.tvEsTehCount);

        btnAddEsTeh.setOnClickListener(v -> {
            esTehCount++;
            tvEsTehCount.setText(String.valueOf(esTehCount));
        });

        btnSubtractEsTeh.setOnClickListener(v -> {
            if (esTehCount > 0) {
                esTehCount--;
                tvEsTehCount.setText(String.valueOf(esTehCount));
            }
        });

        Button btnAddJeruk = findViewById(R.id.btnAddJeruk);
        Button btnSubtractJeruk = findViewById(R.id.btnSubtractJeruk);
        TextView tvJerukCount = findViewById(R.id.tvJerukCount);

        btnAddJeruk.setOnClickListener(v -> {
            jerukCount++;
            tvJerukCount.setText(String.valueOf(jerukCount));
        });

        btnSubtractJeruk.setOnClickListener(v -> {
            if (jerukCount > 0) {
                jerukCount--;
                tvJerukCount.setText(String.valueOf(jerukCount));
            }
        });

        Button btnAddKopiGulaAren = findViewById(R.id.btnAddKopiGulaAren);
        Button btnSubtractKopiGulaAren = findViewById(R.id.btnSubtractKopiGulaAren);
        TextView tvKopiGulaArenCount = findViewById(R.id.tvKopiGulaArenCount);

        btnAddKopiGulaAren.setOnClickListener(v -> {
            kopiGulaArenCount++;
            tvKopiGulaArenCount.setText(String.valueOf(kopiGulaArenCount));
        });

        btnSubtractKopiGulaAren.setOnClickListener(v -> {
            if (kopiGulaArenCount > 0) {
                kopiGulaArenCount--;
                tvKopiGulaArenCount.setText(String.valueOf(kopiGulaArenCount));
            }
        });

        Button btnAddWedang = findViewById(R.id.btnAddWedang);
        Button btnSubtractWedang = findViewById(R.id.btnSubtractWedang);
        TextView tvWedangCount = findViewById(R.id.tvWedangCount);

        btnAddWedang.setOnClickListener(v -> {
            wedangCount++;
            tvWedangCount.setText(String.valueOf(wedangCount));
        });

        btnSubtractWedang.setOnClickListener(v -> {
            if (wedangCount > 0) {
                wedangCount--;
                tvWedangCount.setText(String.valueOf(wedangCount));
            }
        });

        Button btnAddMilo = findViewById(R.id.btnAddMilo);
        Button btnSubtractMilo = findViewById(R.id.btnSubtractMilo);
        TextView tvMiloCount = findViewById(R.id.tvMiloCount);

        btnAddMilo.setOnClickListener(v -> {
            miloCount++;
            tvMiloCount.setText(String.valueOf(miloCount));
        });

        btnSubtractMilo.setOnClickListener(v -> {
            if (miloCount > 0) {
                miloCount--;
                tvMiloCount.setText(String.valueOf(miloCount));
            }
        });
    }
}
