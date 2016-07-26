package api.ejemplos.mis.mascotascoursera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList <Contacto> contactos;
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);

        // de que forma quiero mostrar mi recyclerView

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(llm); // le estoy diciendo que reciclerView se comporte como linearlayoutManager
        inicializarListaContactos(); //cargamos los datos y adaptador se crea y se encarga de pasar los datos de aca a llm
        inicializarAdaptador();




    }
    public void inicializarListaContactos(){

        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto(R.drawable.forest_mushroom_icon,"pepe Grillo", "7777777","pepegrillo@gmail.com"));
        contactos.add(new Contacto(R.drawable.shock_rave_bonus_icon,"Juan peroz", "22222222","juanperoz@gmail.com"));
        contactos.add(new Contacto(R.drawable.yammi_banana_icon,"Amalia Gomez", "55557777","AmaliaGomez@gmail.com"));
        contactos.add(new Contacto(R.drawable.candy_icon,"Joana Lopez", "43334444443","Joanalopez@gmail.com"));

    }

    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos); // una vez que lo cargue
        listaContactos.setAdapter(adaptador); //lo tengo que mostrar

    }
}
