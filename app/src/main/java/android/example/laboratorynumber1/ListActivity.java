package android.example.laboratorynumber1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<ImageText> massInfo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //RecyclerView listPrint = findViewById(R.id.list_print);
        ListView listPrint = findViewById(R.id.list_print);
        ImageTextAdapter adapt = new ImageTextAdapter(this, R.layout.list_item, massInfo);
        String a;
        listPrint.setAdapter(adapt);
        ImageTextAdapterRecycle adrc = new ImageTextAdapterRecycle(this,R.layout.list_item,massInfo);
        //listPrint.setAdapter(adrc);
        String word;



        for (int i=1;i <= 1000000; i++)
        {
            PrintWord test = new PrintWord(i);

            if ((i%2)==1) {
        //        a =String.valueOf(i);


                word=test.printOfWord(i);
                ImageText obg = new ImageText("#CCCCCC", word , R.drawable.imag);
                massInfo.add(obg);
            }
            else {
                 word=test.printOfWord(i);
        //        a =String.valueOf(i);
                ImageText obg = new ImageText("#FFFFFF", word, R.drawable.images);
                massInfo.add(obg);
            }

        }

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
