package com.cornez.tapbuttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nu;
    private TextView su;
    private Button in;
    private Button de;
    private Button co;
    private Button re;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in = (Button) findViewById(R.id.inc);
        de = (Button) findViewById(R.id.dec);
        co = (Button) findViewById(R.id.comp);
        re = (Button) findViewById(R.id.reset);
        nu = (TextView) findViewById(R.id.num);
        su = (TextView) findViewById(R.id.sum);

        in.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                counter++;
                nu.setText(Integer.toString(counter));

            }
        });

        de.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                if(counter>0)
                counter--;
                nu.setText(Integer.toString(counter));

            }
        });

        re.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                counter=0;
                su.setText(Integer.toString(counter));
                nu.setText(Integer.toString(counter));
                in.setEnabled(true);
                de.setEnabled(true);
            }
        });

        co.setOnClickListener(new Button.OnClickListener(){


            @Override
            public void onClick(View v) {
                int sum1=1;

                for(int i=1;i<=counter;i++)
                    sum1*=i;
                su.setText(Integer.toString(sum1));
                in.setEnabled(false);
                de.setEnabled(false);

            }
        });



    }
}

