package petfood.proyecto.laboratorio.arqui2.petfood2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button orderButton = (Button)findViewById(R.id.sig1);

        //--- BOTON QUE REDIRECCIONA A OTRA ACTIVIDAD--//
        orderButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               //Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
               Intent button_uno = new Intent(MainActivity.this, HorarioActivity.class);
               startActivity(button_uno);
           }
        });
                //---END BOTON---//
    }

}
