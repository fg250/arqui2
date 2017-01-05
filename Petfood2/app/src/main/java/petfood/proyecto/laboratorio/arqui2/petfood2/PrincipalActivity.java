package petfood.proyecto.laboratorio.arqui2.petfood2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        final ImageView imgcomidafull= (ImageView)findViewById(R.id.comida_full); //--valor de imagenactiva[0] = 1
        final ImageView imgcomidamed= (ImageView)findViewById(R.id.comida_med); //--valor de imagenactiva[0] = 2
        final ImageView imgcomidavac= (ImageView)findViewById(R.id.comida_vac); //--valor de imagenactiva[0] = 3
        final ImageView imgbebidafull= (ImageView)findViewById(R.id.agua_full);//--valor de imagenactiva[0] = 4
        final ImageView imgbebidavac= (ImageView)findViewById(R.id.agua_vac); //--valor de imagenactiva[0] = 5
        final ImageView imgluzon= (ImageView)findViewById(R.id.luz_on); //--valor de imagenactiva[0] = 6
        final ImageView imgluzoff= (ImageView)findViewById(R.id.luz_off);//--valor de imagenactiva[0] = 7
        final TextView lblestado = (TextView)findViewById(R.id.lblestado);
        final int[] imagenactiva = {0};

        //--- Boton que muestra el estado de la comida
        ImageButton comidaButton = (ImageButton)findViewById(R.id.btncomida);

        comidaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //--ESTOS IF SIRVEN PARA OCULTAR EL IMAGEVIEW QUE SE ESTA MOSTRANDO, PARA LUEGO MOSTRAR EL NUEVO IMAGEVIEW
                if(imagenactiva[0] ==1){
                    imgcomidafull.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==2){
                    imgcomidamed.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==3){
                    imgcomidavac.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==4){
                    imgbebidafull.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] == 5){
                    imgbebidavac.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==6){
                    imgluzon.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==7){
                    imgluzoff.setVisibility(View.INVISIBLE);
                }
                //--AQUI VA EL IF QUE DEPENDE DE LA SENAL QUE RECIBE DEL ARDUINO, LO QUE CAMBIA ES EL VALOR "comida_full" CAMBIARLO POR YA SEA "comida_mid" O "comida_vac"
                //--CAMBIAR TAMBIEN EL VALOR DE imagenactiva[0] AL VALOR CORRESPONDIENTE A LA IMAGEN QUE SE VA A MOSTRAR
                imgcomidafull.setVisibility(View.VISIBLE);
                imagenactiva[0] = 1;
                lblestado.setText("Hay alimento suficiente");
            }
        });

        //--- Boton que muestra el estado del agua
        ImageButton bebidaButton = (ImageButton)findViewById(R.id.btnbebida);

        bebidaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(imagenactiva[0] ==1){
                    imgcomidafull.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==2){
                    imgcomidamed.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==3){
                    imgcomidavac.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==4){
                    imgbebidafull.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] == 5){
                    imgbebidavac.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==6){
                    imgluzon.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==7){
                    imgluzoff.setVisibility(View.INVISIBLE);
                }

                //--AQUI VA EL IF QUE DEPENDE DE LA SENAL QUE RECIBE DEL ARDUINO, IGUAL QUE EN EL BOTON PASADO
                imgbebidafull.setVisibility(View.VISIBLE);
                imagenactiva[0] = 4;
                lblestado.setText("Hay agua en el recipiente");
            }
        });

        //--- Boton que muestra el estado de la iluminacion
        ImageButton luzButton = (ImageButton)findViewById(R.id.btnluz);

        luzButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(imagenactiva[0] ==1){
                    imgcomidafull.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==2){
                    imgcomidamed.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==3){
                    imgcomidavac.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==4){
                    imgbebidafull.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] == 5){
                    imgbebidavac.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==6){
                    imgluzon.setVisibility(View.INVISIBLE);
                }else if(imagenactiva[0] ==7){
                    imgluzoff.setVisibility(View.INVISIBLE);
                }
                //--LO MISMO QUE EN LOS BOTONES ANTERIORES
                imgluzon.setVisibility(View.VISIBLE);
                imagenactiva[0] = 6;
                lblestado.setText("Hay iluminacion");
            }
        });
    }
}
