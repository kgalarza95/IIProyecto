package ec.ug.iiproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }




    //==============================================================================================
    //menu de los tres puntitos (metodo soobreescrito para que se muestre el menu)
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    //acciones que debe tomar al seleccionar el item del menu (metodo sobreescrito)
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.nuevo:
                Toast.makeText(this, "Seleccionó nuevo", Toast.LENGTH_SHORT).show();
                return true;
            //break;
            default:
                System.out.println("No coonfigurado");
                return super.onOptionsItemSelected(item);
        }
    }

    public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this,v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_emergente, popup.getMenu());
        popup.show();
    }
    //==============================================================================================
}