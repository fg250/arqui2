package petfood.proyecto.laboratorio.arqui2.petfood2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import petfood.proyecto.laboratorio.arqui2.petfood2.model.DBHelper;
import petfood.proyecto.laboratorio.arqui2.petfood2.model.userDBDef;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    String nombre;
    String correo;
    String masc;
    String tipo;
    private DBHelper miHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miHelper = new DBHelper(this);

        ImageButton perroButton = (ImageButton)findViewById(R.id.btnperro);
        perroButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tipo = "perro";
            }
        });

        ImageButton gatoButton = (ImageButton)findViewById(R.id.btngato);
        gatoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tipo = "gato";
            }
        });


       //--- Boton que redirecciona al layout Horario--//
        Button orderButton = (Button)findViewById(R.id.sig1);
        orderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText nom = (EditText)findViewById(R.id.txtname);
                nombre = nom.getText().toString();
                EditText email = (EditText)findViewById(R.id.txtemail);
                correo = email.getText().toString();
                EditText mascota = (EditText)findViewById(R.id.txtnommasc);
                masc = mascota.getText().toString();

                Intent button_uno = new Intent(MainActivity.this, HorarioActivity.class);
                button_uno.putExtra("n",nombre);
                button_uno.putExtra("c",correo);
                button_uno.putExtra("m",masc);
                button_uno.putExtra("t",tipo);
               startActivity(button_uno);
           }
        });
    }

}
