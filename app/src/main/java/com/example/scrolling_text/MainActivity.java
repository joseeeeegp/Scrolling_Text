package com.example.scrolling_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private boolean edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=false;
    }
    public void addComent(View view){
        EditText textoEditado=(EditText)findViewById(R.id.editText);
        Button boton =(Button) view;
        if(edit==false){
            boton.setText("Para de meter comentarios");
            textoEditado.setText(textoEditado.getText()+"\n\n- ");
            textoEditado.setSelection(textoEditado.length());
            textoEditado.setEnabled(true);
            textoEditado.requestFocus();

        }else{
            textoEditado.clearFocus();
            boton.setText("Pon un comentario");
            textoEditado.setEnabled(false);
        }
        edit ^=true;
    }
}
