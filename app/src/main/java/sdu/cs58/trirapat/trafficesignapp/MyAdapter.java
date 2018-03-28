package sdu.cs58.trirapat.trafficesignapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 37-SDU on 03/28/18.
 */

//คลาสนี้ทำหน้าที่สร้าง layout(mylistview) เสมือน เพื่อนำไปแสดงผลที่หน้า MainActivity

public class MyAdapter extends BaseAdapter{
    //ประกาศตัวแปร
    private Context context;
    private int[] ints; //เก็บข้อมูลป้ายชื่อจราจร
    private String[] titleStrings , detailStrings; //เก็บข้อมูลชื่อกับรายละเอียดของข้อมูลป้ายจราจร

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() { //นับจำนวนข้อมูลใน array แล้วส่งข้อมูลไปยัง Method getView()
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //รับข้อมูลจาก Method getCount() มาแสดงผลบนแอป
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //ผูกตัวแปรบนจาวา กับอิลิเมนท์บน XML ที่หน้า my_listview

        ImageView imageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.txv1);
        TextView detailTextView = view1.findViewById(R.id.txv2);

        //นำข้อมูลไปแสดงผลบน App
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        return view1;
    }
}//end class MyAdapter
