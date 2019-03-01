package ir.firstapp.testdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String family = intent.getStringExtra("family");
        String age = intent.getStringExtra("age");
        String address = intent.getStringExtra("address");

        TextView viewname = findViewById(R.id.viewname);
        TextView viewfamily = findViewById(R.id.viewfamily);
        TextView viewage = findViewById(R.id.viewage);
        TextView viewaddress = findViewById(R.id.viewaddress);

        viewname.setText("first name is"+name);
        viewfamily.setText("first name is"+family);
        viewage.setText("first name is"+age);
        viewaddress.setText("first name is"+address);


    }
}
