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
import b3.epsimarket.model.Rayon;

public class RayonAdaptater extends ArrayAdapter<Rayon> {

    public RayonAdaptater(@NonNull Context context, int resource, @NonNull List<Rayon> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(R.layout.rayons, null);
        TextView nom_rayon = (TextView) convertView.findViewById(R.id.nom_rayon);
        Rayon rayon = getItem(position);
        nom_rayon.setText(rayon.getTitle());
        return convertView;
    }
}