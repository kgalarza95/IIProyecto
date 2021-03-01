package ec.ug.iiproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void irLogin(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void irFrmPersonas(View view){
        Intent intent = new Intent(this, FrmPersonal.class);
        startActivity(intent);
    }

    public void irFrmCliente(View view){
        Intent intent = new Intent(this, FrmCliente.class);
        startActivity(intent);
    }
    public void irVistaAyuda(View view){
        Intent intent = new Intent(this, VistaAyuda.class);
        startActivity(intent);
    }
}