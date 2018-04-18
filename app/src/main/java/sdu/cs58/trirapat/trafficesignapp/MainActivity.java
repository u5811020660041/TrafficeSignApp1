package sdu.cs58.trirapat.trafficesignapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //ผูกตัวแปร
    ListView listView;
    private int[] ints = new int[]{R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03,R.drawable.traffic_04,
            R.drawable.traffic_05,R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,R.drawable.traffic_09,
            R.drawable.traffic_10,R.drawable.traffic_11,R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,
            R.drawable.traffic_15,R.drawable.traffic_16,R.drawable.traffic_17,R.drawable.traffic_18,R.drawable.traffic_19,
            R.drawable.traffic_20};
    private String[] titleStrings, detailStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //เอาค่าจาก XML ที่ไฟล์ my_content มาแสดงผล
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints, titleStrings, detailStrings);
        listView.setAdapter(myAdapter);

    }//end onCreate Method

    public void clickAboutMe(View view) {
        Intent aboutmeIntent = new Intent(MainActivity.this, AboutMeActivity.class);
        startActivity(aboutmeIntent);
    }
}//end class
