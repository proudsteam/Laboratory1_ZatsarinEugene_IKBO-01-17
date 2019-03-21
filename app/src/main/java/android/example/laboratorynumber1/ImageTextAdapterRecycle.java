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

import java.util.ArrayList;
import java.util.List;

public class ImageTextAdapterRecycle extends RecyclerView.Adapter<HolderImageText> {

    private LayoutInflater inflater;
    private int layout;
    private ArrayList<ImageText> ListAr;

    public ImageTextAdapterRecycle(Context context, int resource, ArrayList<ImageText> array) {
        //super(context, resource, array);
        this.ListAr = array;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderImageText onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view123=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        HolderImageText rowTWO = new HolderImageText(view123);


        return rowTWO;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderImageText holderImageText, int i) {

            ImageText obj = ListAr.get(i);
            holderImageText.itemView.setBackgroundColor(Color.parseColor(obj.getColor()));
            holderImageText.textView.setBackgroundColor(Color.parseColor(obj.getColor()));
            holderImageText.imageView.setImageResource(obj.getImage());
            holderImageText.imageView.setBackgroundColor(Color.parseColor(obj.getColor()));
            holderImageText.textView.setText(obj.getText());





    }


    @Override
    public int getItemCount() {
        return ListAr.size();
    }
}
