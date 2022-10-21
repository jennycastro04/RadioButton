package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rbsuma, rbresta, rbmulti, rbraiz, rbpoten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        rbsuma=findViewById(R.id.rbsuma);
        rbresta=findViewById(R.id.rbresta);
        rbmulti=findViewById(R.id.rbmulti);
        rbraiz=findViewById(R.id.rbraiz);
        rbpoten=findViewById(R.id.rbpoten);

    }

    public void operacion(View view){
        String v1 = et1.getText().toString();
        String v2 = et2.getText().toString();
        int vl1 = Integer.parseInt(v1);
        int vl2 = Integer.parseInt(v2);
        if(rbsuma.isChecked()==true){
            int suma = vl1 + vl2;
            String msj = String.valueOf(suma);
            tv1.setText(msj);
        }else{
            if (rbresta.isChecked()==true){
                int resta = vl1 - vl2;
                String msj = String.valueOf(resta);
                tv1.setText(msj);
            }else{
                if (rbmulti.isChecked()==true){
                    int mul = vl1 * vl2;
                    String msj = String.valueOf(mul);
                    tv1.setText(msj);
                }else{
                    if (rbpoten.isChecked()==true){
                        double pot = Math.pow(vl1, vl2);
                        String msj = String.valueOf(pot);
                        tv1.setText(msj);
                    }else{
                        if (rbraiz.isChecked()==true){
                            double raiz = Math.sqrt(vl1);
                            double raiz2 = Math.sqrt(vl2);
                            String m ="La raiz del primer numero es de "+raiz+" La raiz" +
                                    "del segundo numero es de "+raiz2;
                            tv1.setText(m);
                        }
                    }
                }
            }
        }
    }
}