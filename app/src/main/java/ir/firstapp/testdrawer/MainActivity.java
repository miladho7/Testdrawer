package ir.firstapp.testdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsubmit = findViewById(R.id.btnsubmit);
        final EditText name = findViewById(R.id.txtname);
        final EditText family = findViewById(R.id.txtfamily);
        final EditText age = findViewById(R.id.txtage);
        final EditText address = findViewById(R.id.txtaddress);


        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoviewingpage = new Intent(MainActivity.this,view.class);
                gotoviewingpage.putExtra("name", name.getText().toString());
                gotoviewingpage.putExtra("family", family.getText().toString());
                gotoviewingpage.putExtra("age", age.getText().toString());
                gotoviewingpage.putExtra("address", address.getText().toString());

                startActivityForResult(gotoviewingpage,123);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123){
        if(resultCode == RESULT_OK){
            Toast.makeText(this, "submit your data", Toast.LENGTH_SHORT).show();
        }
    }
}
