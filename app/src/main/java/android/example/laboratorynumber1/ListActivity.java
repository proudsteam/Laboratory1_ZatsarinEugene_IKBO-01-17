package android.example.laboratorynumber1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<ImageText> massInfo = new ArrayList<>();
    RecyclerView listprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listprint = findViewById(R.id.list_print);
        listprint.setLayoutManager(new LinearLayoutManager(this));
        //ListView listPrint = findViewById(R.id.list_print);
        //ImageTextAdapter adapt = new ImageTextAdapter(this, R.layout.list_item, massInfo);
        //ImageTextAdapterRecycle RecAdapter = new ImageTextAdapterRecycle(this,R.layout.list_item,massInfo);
        MyRecycleAdapter myAdapter = new MyRecycleAdapter(massInfo);
        listprint.setAdapter(myAdapter);
        //listPrint.setAdapter(adapt);
      //  String word;



//        for (int i=1;i <= 1000000; i++)
//        {
//            PrintWord test = new PrintWord(i);
//
//            if ((i%2)==1) {
//        //        a =String.valueOf(i);
//
//
//                word=test.printOfWord(i);
//                ImageText obg = new ImageText("#CCCCCC", word , R.drawable.imag);
//                massInfo.add(obg);
//            }
//            else {
//                 word=test.printOfWord(i);
//        //        a =String.valueOf(i);
//                ImageText obg = new ImageText("#FFFFFF", word, R.drawable.images);
//                massInfo.add(obg);
//            }
//
//        }

 //       for (int i=1;i <= 50000; i++)
 //       {
 //           PrintWord test = new PrintWord();
//
//
 //               //        a =String.valueOf(i);
//
//
 //               word=test.printOfWord(i);
 //               ImageText obg = new ImageText("#CCCCCC", word , R.drawable.imag);
 //               massInfo.add(obg);
 //           i++;
 //               word=test.printOfWord(i);
 //               //        a =String.valueOf(i);
 //               ImageText obg1 = new ImageText("#FFFFFF", word, R.drawable.images);
 //               massInfo.add(obg1);
//
//
 //       }

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
