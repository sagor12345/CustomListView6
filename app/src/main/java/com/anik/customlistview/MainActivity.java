package com.anik.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryList[] = {"Md.Shamim Hossain", "Md.Al-Amin", "Sudipto Roy Arnob", "Md.Ahasan habib", "Md. Abdullah", "Md Farhad Hossain", "Sadiqur Rahman"};
    int imgList[] = {R.drawable.shamim, R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.america, R.drawable.new_zealand, R.drawable.portugle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList = findViewById(R.id.listview);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this, countryList, imgList);
        customList.setAdapter(adapter);

        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Toast.makeText(MainActivity.this, countryList[position], Toast.LENGTH_SHORT).show();
                String name = "Name:";

                if (position == 0) {


                    String info = getResources().getString(R.string.shamim);
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("name", name + info);
                    intent.putExtra("ig", imgList[0]);
                    startActivity(intent);
                }
                if (position == 1) {


                    String info = getResources().getString(R.string.Md_AlAmin);
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("name", name +info);
                    intent.putExtra("ig", imgList[1]);
                    startActivity(intent);
                }
                if (position == 2) {


                    String info = getResources().getString(R.string.Sudipto_Roy_Arnob);
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("name", name+info);
                    intent.putExtra("ig", imgList[2]);
                    startActivity(intent);
                }
                if (position == 3) {


                    String info = getResources().getString(R.string.Md_Ahasan_habib);
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("name", name+info);
                    intent.putExtra("ig", imgList[3]);
                    startActivity(intent);
                }
                if (position == 4) {


                    String info = getResources().getString(R.string.Md_Ahasan_habib);
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    intent.putExtra("name", name+info);
                    intent.putExtra("ig", imgList[4]);
                    startActivity(intent);
                }

            }
        });


    }
}
