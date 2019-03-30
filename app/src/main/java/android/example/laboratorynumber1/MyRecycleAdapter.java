package android.example.laboratorynumber1;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyRecycleHolder> {
    private ArrayList<ImageText> ListAr;
    private PrintWord print;

    public MyRecycleAdapter(ArrayList<ImageText> listAr) {
        ListAr = listAr;
    }

    @NonNull
    @Override
    public MyRecycleHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view123= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new MyRecycleHolder(view123);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleHolder myRecycleHolder, int i) {
   //     ImageText obj = ListAr.get(i);
   //     myRecycleHolder.itemView.setBackgroundColor(Color.parseColor(obj.getColor()));
   //     myRecycleHolder.txtView.setBackgroundColor(Color.parseColor(obj.getColor()));
   //     myRecycleHolder.imgView.setImageResource(obj.getImage());
   //     myRecycleHolder.imgView.setBackgroundColor(Color.parseColor(obj.getColor()));
   //     myRecycleHolder.txtView.setText(obj.getText());
        i++;
        Log.d("Zheka","" + i);
        if (i%2 == 1) {
            Log.d("Zheka",""+i);
            myRecycleHolder.itemView.setBackgroundColor(Color.parseColor("#CCCCCC"));
            myRecycleHolder.txtView.setBackgroundColor(Color.parseColor("#CCCCCC"));
            myRecycleHolder.imgView.setImageResource(R.drawable.imag);
            myRecycleHolder.imgView.setBackgroundColor(Color.parseColor("#CCCCCC"));
            myRecycleHolder.txtView.setText(print.printOfWord(i));
        }
        else {
            Log.d("Zheka",""+i);
            myRecycleHolder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            myRecycleHolder.txtView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            myRecycleHolder.imgView.setImageResource(R.drawable.images);
            myRecycleHolder.imgView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            myRecycleHolder.txtView.setText(print.printOfWord(i));

        }
    }

    @Override
    public int getItemCount() {
        return 999999;
    }

    public class MyRecycleHolder extends RecyclerView.ViewHolder {
        ImageView imgView;
        TextView txtView;
        public MyRecycleHolder(@NonNull View itemView) {
            super(itemView);
            print = new PrintWord();
            imgView = (ImageView) itemView.findViewById(R.id.img);
            txtView = (TextView) itemView.findViewById(R.id.txt);
        }
    }
}
