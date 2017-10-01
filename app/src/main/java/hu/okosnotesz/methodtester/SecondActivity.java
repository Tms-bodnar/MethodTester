package hu.okosnotesz.methodtester;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 2017.09.30..
 */

public class SecondActivity extends AppCompatActivity{
    Button btn2;
    Button btn3;
    TextView tv3;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("xxx", "Second onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        tv3 = (TextView) findViewById(R.id.tv3);
        final Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            String str = bundle.getString("et1");
            if (str != null) {
                tv3.setText(str);
            }
        }
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                if(tv3.getText()!=null){
                    i.putExtra("back", tv3.getText().toString());
                }
                startActivity(i);

            }
        });
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
       super.onBackPressed();
    }

    @Override
    protected void onRestart() {
        Log.d("xxx", "Second onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d("xxx", "Second onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.d("xxx", "Second onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("xxx", "Second onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("xxx", "Second onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("xxx", "Second onDestroy");
        super.onDestroy();
    }
}
