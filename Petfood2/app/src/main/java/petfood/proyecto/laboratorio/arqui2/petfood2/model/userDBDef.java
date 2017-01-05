package petfood.proyecto.laboratorio.arqui2.petfood2.model;

/**
 * Created by FG250 on 05/01/2017.
 */

public class userDBDef {
    //Nombre del esquema de Base de Datos
    public static final String DATABASE_NAME = "bdpetfood";
    //Version de la Base de Datos (Este parámetro es importante  )
    public static final int DATABASE_VERSION = 1;

    //Una clase estatica en la que se definen las propiedaes que determinan la tabla Notes
    // y sus 4 columnas
    public static class NOTES {
        //Nombre de la tabla
        public static final String TABLE_NAME = "datos";
        //Nombre de las Columnas que contiene la tabla
        public static final String NOM_COL = "nombre";
        public static final String CORREO_COL = "correo";
        public static final String MASCOTA_COL = "mascota";
        public static final String TIPO_COL = "tipo";
        public static final String EDAD_COL = "edad";
        public static final String TAMANO_COL = "tamano";
        public static final String HORARIO_COL = "horario";
        public static final String PORCION_COL = "porcion";
    }

    //Setencia SQL que permite crear la tabla Notes
    public static final String NOTES_TABLE_CREATE =
            "CREATE TABLE " + NOTES.TABLE_NAME + " (" +
                    NOTES.NOM_COL + " TEXT, " +
                    NOTES.CORREO_COL + " TEXT, " +
                    NOTES.MASCOTA_COL + " TEXT, " +
                    NOTES.TIPO_COL + " TEXT, " +
                    NOTES.EDAD_COL + " TEXT, " +
                    NOTES.TAMANO_COL + " TEXT, " +
                    NOTES.HORARIO_COL + " TEXT, " +
                    NOTES.PORCION_COL + " TEXT);";

    //Setencia SQL que permite eliminar la tabla Notes
    public static final String NOTES_TABLE_DROP = "DROP TABLE IF EXISTS " + NOTES.TABLE_NAME;
}
