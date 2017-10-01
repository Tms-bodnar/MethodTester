package hu.okosnotesz.methodtester;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button btn;
    TextView tv2;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("xxx", "Main onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = new Intent(MainActivity.this, SecondActivity.class);
        TextView sec = (TextView) findViewById(R.id.tvSec);
        et1 = (EditText) findViewById(R.id.et1);
        btn = (Button) findViewById(R.id.btn1);
        tv2 = (TextView) findViewById(R.id.tv2);
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("xxx", et1.getText().toString());
                i.putExtra("et1", et1.getText().toString());
                tv2.setText(et1.getText());
            }
        });
    }

    @Override
    protected void onRestart() {
        Log.d("xxx", "Main onRestart");

        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d("xxx", "Main onResume");
        if(getIntent().getExtras()!=null){
            Bundle b = getIntent().getExtras();
            if(b.getString("back")!=null){
                tv2.setText(b.getString("back"));
            }
        }
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.d("xxx", "Main onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("xxx", "Main onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("xxx", "Main onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("xxx", "Main onDestroy");
        super.onDestroy();
    }
}
