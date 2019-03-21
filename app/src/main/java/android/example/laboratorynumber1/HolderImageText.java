package android.example.laboratorynumber1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HolderImageText extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView ;
    public HolderImageText(@NonNull View itemView) {
        super(itemView);
         imageView = (ImageView) itemView.findViewById(R.id.img);
         textView =(TextView)  itemView.findViewById(R.id.txt);
    }
}



