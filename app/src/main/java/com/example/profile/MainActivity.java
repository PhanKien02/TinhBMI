package com.example.profile;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void tinh_BMI(View view) {
        EditText txtCanNang= findViewById(R.id.can_nang);
        TextView textView  = findViewById(R.id.BMI);
        EditText txtChieuCao= findViewById(R.id.chieu_cao);
        double canNang = Double.parseDouble(txtCanNang.getText().toString());
        double chieuCao =Double.parseDouble(txtChieuCao.getText().toString());
        double BMI = canNang / (chieuCao * chieuCao);
        if(BMI<18)
            textView.setText("BMI ="+BMI+"Người gầy");
        else
            if(BMI<24.9)
                textView.setText("BMI ="+BMI+ "Người bình thường");
        else
            if (BMI<29.9)
                textView.setText("BMI ="+BMI+ "Người béo phì độ I");
        else
            if(BMI <34.9)
                textView.setText("BMI ="+BMI+ "Người béo phì độ II");
        else
                textView.setText("BMI ="+BMI+ "Người béo phì độ III");
    }
}