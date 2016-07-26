package api.ejemplos.mis.mascotascoursera;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nicopro on 26/7/16.
 */
public class ContactoAdaptador extends RecyclerView.Adapter <ContactoAdaptador.ContactoViewHolder>{

    ArrayList<Contacto> contactos;



    public ContactoAdaptador(ArrayList<Contacto> contactos) {
        this.contactos= contactos;  //<--- ACA TENGO QUE RECIBIR LA LISTA QUE VOY A TRANSFERIR A LLM
    }

    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto, parent, false);
        return new ContactoViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ContactoViewHolder contactoViewHolder, int position) {
        Contacto contacto = contactos.get(position);
        contactoViewHolder.imgFoto.setImageResource(contacto.getFoto());
        contactoViewHolder.tvNombre.setText(contacto.getNombre());
        contactoViewHolder.tvTelefono.setText(contacto.getTelefono());

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder
    {

        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvTelefono;


        public ContactoViewHolder(View itemView) {
            super(itemView);
            imgFoto     = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre    = (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvTelefono  = (TextView) itemView.findViewById(R.id.tvTelefonoCV);

        }
    }

}
