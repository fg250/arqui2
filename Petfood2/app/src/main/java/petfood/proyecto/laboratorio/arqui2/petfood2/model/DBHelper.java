package petfood.proyecto.laboratorio.arqui2.petfood2.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.AccessControlContext;

/**
 * Created by FG250 on 05/01/2017.
 */


public class DBHelper  extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, userDBDef.DATABASE_NAME, null, userDBDef.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(userDBDef.NOTES_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(userDBDef.NOTES_TABLE_DROP);
        this.onCreate(db);
    }

    public void insertUser(user usuario){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(userDBDef.NOTES.NOM_COL, usuario.getNombre());
        values.put(userDBDef.NOTES.CORREO_COL, usuario.getCorreo());
        values.put(userDBDef.NOTES.MASCOTA_COL, usuario.getMascota());
        values.put(userDBDef.NOTES.TIPO_COL, usuario.getTipo());
        values.put(userDBDef.NOTES.EDAD_COL, usuario.getEdadmascota());
        values.put(userDBDef.NOTES.TAMANO_COL, usuario.getTamano());
        values.put(userDBDef.NOTES.HORARIO_COL, usuario.getHorario());
        values.put(userDBDef.NOTES.PORCION_COL, usuario.getPorcion());

        // 3. Insertamos los datos en la tabla "notes"
        db.insert(userDBDef.NOTES.TABLE_NAME, null, values);

        // 4. Cerramos la conexión comn la BD
        db.close();
    }

    public user getUserByName(String nom){
        user aUser = null;
        SQLiteDatabase db = this.getReadableDatabase();
        String[] COLUMNS = {userDBDef.NOTES.NOM_COL, userDBDef.NOTES.CORREO_COL, userDBDef.NOTES.MASCOTA_COL, userDBDef.NOTES.TIPO_COL, userDBDef.NOTES.EDAD_COL, userDBDef.NOTES.TAMANO_COL, userDBDef.NOTES.HORARIO_COL, userDBDef.NOTES.PORCION_COL};

        Cursor cursor =
                db.query(userDBDef.NOTES.TABLE_NAME,  //Nomre de la tabla
                        COLUMNS, // b. Nombre de las Columnas
                        " nombre = ?", // c. Columnas de la clausula WHERE
                        new String[] { String.valueOf(nom) }, // d. valores de las columnas de la clausula WHERE
                        null, // e. Clausula Group by
                        null, // f. Clausula having
                        null, // g. Clausula order by
                        null); // h. Limte de regsitros

        // 3. Si hemos obtenido algun resultado entonces sacamos el primero de ellos ya que se supone
        //que ha de existir un solo registro para un id
        if (cursor != null) {
            cursor.moveToFirst();
            // 4. Contruimos el objeto Note
            aUser = new user();
            aUser.setNombre(cursor.getString(0));
            aUser.setCorreo(cursor.getString(1));
            aUser.setMascota(cursor.getString(2));
            aUser.setTipo(cursor.getString(3));
            aUser.setEdadmascota(Integer.parseInt(cursor.getString(4)));
            aUser.setTamano(cursor.getString(5));
            aUser.setHorario(cursor.getString(6));
            aUser.setPorcion(Integer.parseInt(cursor.getString(7)));
        }



        return aUser;
    }
}