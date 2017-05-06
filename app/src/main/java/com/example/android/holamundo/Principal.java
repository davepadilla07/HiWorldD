package com.example.android.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    private EditText cajaNumeroUno;
    private EditText cajaNumeroDos;
    private TextView cajaResultado;
    int n1, n2, suma, resta, multi, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //capturar cajas
        cajaNumeroUno=(EditText)findViewById(R.id.txtNumeroUno);
        cajaNumeroDos=(EditText)findViewById(R.id.txtNumeroDos);
        cajaResultado=(TextView) findViewById(R.id.txtResultado);

        //

    }

    //metodo para calcular
    public void calcular(View v){

        double n1,n2,suma;
        if (validar()){
            n1=Double.parseDouble(cajaNumeroUno.getText().toString());
            n2=Double.parseDouble(cajaNumeroDos.getText().toString());
            suma=n1+n2;
            cajaResultado.setText(""+suma);
        }
    }

    //metodo para restar
    public void restar(View v){

        double n1,n2,suma;
        if (validar()) {
            n1 = Double.parseDouble(cajaNumeroUno.getText().toString());
            n2 = Double.parseDouble(cajaNumeroDos.getText().toString());
            suma = n1 - n2;
            cajaResultado.setText("" + suma);
        }

    }

    //Metodo para multiplicar
    public void multiplicar(View v){

        double n1,n2,suma;
        if (validar()) {
            n1 = Double.parseDouble(cajaNumeroUno.getText().toString());
            n2 = Double.parseDouble(cajaNumeroDos.getText().toString());
            suma = n1 * n2;
            cajaResultado.setText("" + suma);
        }

    }

    //Metodo para dividir
    public void dividir(View v){

        double n1,n2,suma;
        if (validar()) {
            n1 = Double.parseDouble(cajaNumeroUno.getText().toString());
            n2 = Double.parseDouble(cajaNumeroDos.getText().toString());
            suma = n1 / n2;
            cajaResultado.setText("" + suma);
        }

    }

    //Metodo para borrar
    public void borrar(View v){
        cajaNumeroUno.setText("");
        cajaNumeroDos.setText("");
        cajaResultado.setText("");
        cajaNumeroUno.requestFocus();
    }



    public boolean validar(){
        if (cajaNumeroUno.getText().toString().isEmpty()){
            cajaNumeroUno.requestFocus();
            cajaNumeroUno.setError(getResources().getString(R.string.error1));
            return false;
        }
        if (cajaNumeroDos.getText().toString().isEmpty()){
            cajaNumeroDos.requestFocus();
            cajaNumeroDos.setError(getResources().getString(R.string.error2));
            return false;
        }
        return true;
    }


}
