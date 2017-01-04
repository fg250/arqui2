package petfood.proyecto.laboratorio.arqui2.petfood2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.LinkedList;

public class HorarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        //Cargando el spinner de edades
        Spinner spinner_edad = (Spinner) findViewById(R.id.spinner_ed);
        ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( this, R.array.EdadesPerros , android.R.layout.simple_spinner_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_edad.setAdapter(spinner_adapter);

        //Cargando el spinner de tamanos
        Spinner spinner_tamano = (Spinner) findViewById(R.id.spinner_tm);
        ArrayAdapter spinner_adap = ArrayAdapter.createFromResource( this, R.array.Tamaños, android.R.layout.simple_spinner_item);
        spinner_adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_tamano.setAdapter(spinner_adap);

        //Agregando el listener para guardar el valor seleccionado
        spinner_tamano.setOnItemSelectedListener(new MyOnItemSelectedListener());

    }
}

class MyOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
    public void onItemSelected(AdapterView parent, View view, int pos, long id) {
        if (parent.getId() == R.id.spinner_tm) {
            String tamaño = (parent.getItemAtPosition(pos)).toString();
        }
        //Podemos hacer varios ifs o un switchs por si tenemos varios spinners.
    }
    public void onNothingSelected(AdapterView parent) {
        // Do nothing.
    }
}
