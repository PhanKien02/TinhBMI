package com.example.profile;

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

//    public void tinh_BMI(View view) {
//        EditText txtCanNang= findViewById(R.id.can_nang);
//        TextView textView  = findViewById(R.id.BMI);
//        String can_nang = txtCanNang.getText().toString();
//        EditText txtChieuCao= findViewById(R.id.chieu_cao);
//        String chieu_cao = txtChieuCao.getText().toString();
//        int canNang = Integer.valueOf(can_nang);
//        int chieuCao = Integer.valueOf(chieu_cao);
//        float BMI = canNang / (chieuCao * chieuCao);
//        if(BMI<18)
//            textView.setText("BMI="+BMI+"Người gầy");
//        else
//            if(BMI<24.9)
//                textView.setText("BMI="+BMI+"Người bình thường");
//        else
//            if (BMI<29.9)
//                textView.setText("BMI="+BMI+"Người béo phì độ I");
//        else
//            if(BMI <34.9)
//                textView.setText("BMI="+BMI+"Người béo phì độ II");
//        else
//                textView.setText("BMI="+BMI+"Người béo phì độ III");
//    }
}