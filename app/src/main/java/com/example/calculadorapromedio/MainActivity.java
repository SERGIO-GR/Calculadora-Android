package com.example.calculadorapromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etpe;
    private EditText etfiv;
    private EditText etqiv;
    private EditText etig;
    private EditText etma;
    private EditText etss;
    private EditText etlpti;
    private TextView tvresul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etpe=(EditText) findViewById(R.id.txt_PyE);
        etfiv=(EditText) findViewById(R.id.txt_FIV);
        etqiv=(EditText) findViewById(R.id.txt_QIV);
        etig=(EditText) findViewById(R.id.txt_IGIV);
        etma=(EditText) findViewById(R.id.txt_MAIV);
        etss=(EditText) findViewById(R.id.txt_SSIV);
        etlpti=(EditText) findViewById(R.id.txt_LPTIV);
        tvresul=(TextView) findViewById(R.id.tv_resultado);
    }
    public void calcular (View view){
        String Proba_String = etpe.getText().toString();
        String Fisica_String = etfiv.getText().toString();
        String Quimica_String = etqiv.getText().toString();
        String Ingles_String = etig.getText().toString();
        String MetodosA_String = etma.getText().toString();
        String SoporteS_String = etss.getText().toString();
        String LaboIV_String = etlpti.getText().toString();
        if(etpe.getText().length()==0||etfiv.getText().length()==0||etqiv.getText().length()==0||etig.getText().length()==0||etma.getText().length()==0||etss.getText().length()==0||etlpti.getText().length()==0){
            tvresul.setText("Faltan calificaciones");
        }else {
            int Proba_int = Integer.parseInt(Proba_String);
            int Fisica_int = Integer.parseInt(Fisica_String);
            int Quimica_int = Integer.parseInt(Quimica_String);
            int Ingles_int = Integer.parseInt(Ingles_String);
            int MetodosA_int = Integer.parseInt(MetodosA_String);
            int SoporteS_int = Integer.parseInt(SoporteS_String);
            int LaboIV_int = Integer.parseInt(LaboIV_String);
            int promedio = (Proba_int + Fisica_int + Quimica_int + Ingles_int + MetodosA_int + SoporteS_int + LaboIV_int) / 7;
            if (promedio > 10) {
                tvresul.setText("Ponga las calificaciones correctas");
            } else if (promedio >= 6) {
                tvresul.setText("Alumno aprobado con" + promedio);
            } else if (promedio <= 5) {
                tvresul.setText("Alumno a extraordinario con" + promedio);
            }
        }
    }



}