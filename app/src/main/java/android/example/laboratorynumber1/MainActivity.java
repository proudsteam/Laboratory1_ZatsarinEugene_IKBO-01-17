package android.example.laboratorynumber1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
boolean ba=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
                finish();

            }
        }, 4*1000);
        final Intent intent = new Intent(this,ListActivity.class);


    }
}
