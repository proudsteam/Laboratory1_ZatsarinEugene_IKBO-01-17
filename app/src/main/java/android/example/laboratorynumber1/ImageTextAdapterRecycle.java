package android.example.laboratorynumber1;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ImageTextAdapterRecycle extends RecyclerView.Adapter<HolderImageText> {

    private LayoutInflater inflater;
    private int layout;
    private List<ImageText> array;

    public ImageTextAdapterRecycle(Context context, int resource, List<ImageText> array) {
        //super(context, resource, array);
        this.array = array;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderImageText onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view=inflater.inflate(this.layout, viewGroup, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.img);
        TextView textView = (TextView) view.findViewById(R.id.txt);

        ImageText obj = array.get(position);
        view.setBackgroundColor(Color.parseColor(obj.getColor()));
        textView.setBackgroundColor(Color.parseColor(obj.getColor()));
        imageView.setImageResource(obj.getImage());
        imageView.setBackgroundColor(Color.parseColor(obj.getColor()));
        textView.setText(obj.getText());
        return new HolderImageText(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderImageText holderImageText, int position) {




    }

    @Override
    public int getItemCount() {
        return array.size();
    }
}
