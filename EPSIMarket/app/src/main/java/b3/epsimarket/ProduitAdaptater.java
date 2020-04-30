package b3.epsimarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

import b3.epsimarket.model.Produit;

public class ProduitAdaptater extends ArrayAdapter<Produit> {

    public ProduitAdaptater(@NonNull Context context, int resource, @NonNull List<Produit> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(R.layout.produit_details, null);

        TextView nom_produit = convertView.findViewById(R.id.titre_produit);
        TextView description_produit = convertView.findViewById(R.id.description_produit_details);
        ImageView image_produit = convertView.findViewById(R.id.image_produit);

        Produit produit = getItem(position);

        nom_produit.setText(produit.getName());
        description_produit.setText(produit.getDescription());
        Picasso.get().load(produit.getPictureUrl()).into(image_produit);

        return convertView;
    }
}
