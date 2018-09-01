package ph.edu.iicsust.johnandreraymundo.code0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Code0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code0);


        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        final TextView resultTextView1 = (TextView) findViewById(R.id.resultTextView1);
        final TextView resultTextView2 = (TextView) findViewById(R.id.resultTextView2);
        final TextView resultTextView3 = (TextView) findViewById(R.id.resultTextView3);
        final TextView resultTextView4 = (TextView) findViewById(R.id.resultTextView4);
        final TextView resultTextView5 = (TextView) findViewById(R.id.resultTextView5);
        final TextView resultTextView6 = (TextView) findViewById(R.id.resultTextView6);
        final TextView resultTextView7 = (TextView) findViewById(R.id.resultTextView7);
        final TextView resultTextView8 = (TextView) findViewById(R.id.resultTextView8);
        final TextView resultTextView9 = (TextView) findViewById(R.id.resultTextView9);




        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int[] ArrayKo = new int[10];
                int num = 0;

                for(int counter = 0; counter<ArrayKo.length; counter++) {
                    num = num + 2;
                    ArrayKo[counter] = num;
                }
                resultTextView.setText("The First Ten Even Number Are:" + ArrayKo[0]);
                resultTextView1.setText("The First Ten Even Number Are:" + ArrayKo[1]);
                resultTextView3.setText("The First Ten Even Number Are:" + ArrayKo[2]);
                resultTextView2.setText("The First Ten Even Number Are:" + ArrayKo[3]);
                resultTextView4.setText("The First Ten Even Number Are:" + ArrayKo[4]);
                resultTextView5.setText("The First Ten Even Number Are:" + ArrayKo[5]);
                resultTextView6.setText("The First Ten Even Number Are:" + ArrayKo[6]);
                resultTextView7.setText("The First Ten Even Number Are:" + ArrayKo[7]);
                resultTextView8.setText("The First Ten Even Number Are:" + ArrayKo[8]);
                resultTextView9.setText("The First Ten Even Number Are:" + ArrayKo[9]);
            }
        });
    }
}
