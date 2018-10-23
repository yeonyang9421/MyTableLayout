package kr.co.woobi.imyeon.mytablelayout;

import android.graphics.Color;
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

        final Button button1=(Button)findViewById(R.id.button1);
        final EditText editText = (EditText)findViewById(R.id.editText1);
        button1.setBackgroundColor(Color.parseColor("#99CC00"));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "배부르고 졸려요", Toast.LENGTH_SHORT).show();
                editText.setText("배불러");

            }
        });


    }
}
