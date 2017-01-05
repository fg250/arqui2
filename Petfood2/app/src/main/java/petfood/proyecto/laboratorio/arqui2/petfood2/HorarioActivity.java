package petfood.proyecto.laboratorio.arqui2.petfood2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.LinkedList;


public class HorarioActivity extends AppCompatActivity {
    String nombre;
    String correo;
    String masc;
    String tipo;
    String tam;
    String edad;
    String hor;
    String por;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        nombre = this.getIntent().getExtras().getString("n");
        correo = this.getIntent().getExtras().getString("c");
        masc = this.getIntent().getExtras().getString("m");
        tipo = this.getIntent().getExtras().getString("t");


        //Cargando el spinner de edades
        final Spinner spinner_edad = (Spinner) findViewById(R.id.spinner_ed);
        if(tipo.equalsIgnoreCase("perro")){
            System.out.println("ES UN PERRO!");
            ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( this, R.array.EdadesPerros , android.R.layout.simple_spinner_item);
            spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner_edad.setAdapter(spinner_adapter);
        }
        else if(tipo.equalsIgnoreCase("gato")){
            System.out.println("ES UN GATO!");
            ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( this, R.array.EdadesGatos , android.R.layout.simple_spinner_item);
            spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner_edad.setAdapter(spinner_adapter);
        }
        //Agregando el listener para guardar el valor seleccionado
        spinner_edad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                edad = spinner_edad.getSelectedItem().toString();
                System.out.println(edad);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner spinner_tamano = (Spinner) findViewById(R.id.spinner_tm);

        //Cargando el spinner de tamanos
        if(tipo.equalsIgnoreCase("perro")){

            ArrayAdapter spinner_adap = ArrayAdapter.createFromResource( this, R.array.TamañosPerros, android.R.layout.simple_spinner_item);
            spinner_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner_tamano.setAdapter(spinner_adap);
        }else if (tipo.equalsIgnoreCase("gato")){
            ArrayAdapter spinner_adap = ArrayAdapter.createFromResource( this, R.array.TamañosGatos, android.R.layout.simple_spinner_item);
            spinner_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner_tamano.setAdapter(spinner_adap);
        }


        //Agregando el listener para guardar el valor seleccionado
        spinner_tamano.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                tam = spinner_tamano.getSelectedItem().toString();
                System.out.println(tam);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        //--- Boton que redirecciona al layout principal
        Button sigButton = (Button)findViewById(R.id.sig2);

        sigButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent button_dos = new Intent(HorarioActivity.this, PrincipalActivity.class);
                startActivity(button_dos);
            }
        });

    }
}
