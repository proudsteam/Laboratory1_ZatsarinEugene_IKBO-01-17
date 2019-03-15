package android.example.laboratorynumber1;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ImageTextAdapter extends ArrayAdapter<ImageText> {

    private LayoutInflater inflater;
    private int layout;
    private List<ImageText> array;

    public ImageTextAdapter(Context context, int resource, List<ImageText> array) {
        super(context, resource, array);
        this.array = array;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.img);
        TextView textView = (TextView) view.findViewById(R.id.txt);

        ImageText obj = array.get(position);
        view.setBackgroundColor(Color.parseColor(obj.getColor()));
        textView.setBackgroundColor(Color.parseColor(obj.getColor()));
        imageView.setImageResource(obj.getImage());
        imageView.setBackgroundColor(Color.parseColor(obj.getColor()));
        textView.setText(obj.getText());

        return view;
    }
}
