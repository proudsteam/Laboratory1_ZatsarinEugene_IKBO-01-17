package android.example.laboratorynumber1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<ImageText> massInfo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listPrint = findViewById(R.id.list_print);
        ImageTextAdapter adapt = new ImageTextAdapter(this, R.layout.list_item, massInfo);
        String a;

        listPrint.setAdapter(adapt);
        for (int i=1;i <= 1000000; i++)
        {

            if ((i%2)==1) {
                a =String.valueOf(i);

                ImageText obg = new ImageText("#CCCCCC", a, R.drawable.images);
                massInfo.add(obg);
            }
            else {
                a =String.valueOf(i);
                ImageText obg = new ImageText("#FFFFFF", a, R.drawable.imag);
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
