package sdu.cs58.trirapat.trafficesignapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMeActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

    }//end onCreate Method

    public void clickBack(View view) {
        finish();
    }//end clickBack method

    public void playSound(View view) {
        if (mediaPlayer != null) {//ตรวจสอบว่ามี obj. mediaPlayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop();//ถ้ามีให้หยุดเล่น
            mediaPlayer.release();//คืน resource
        }

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cat);
        mediaPlayer.start();
    }//end playSound method

    public void clickFacebook(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/MYIELODT"));
        startActivity(fbIntent);
    }//end clickFacebook Method

    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0920920851"));
        startActivity(mobileIntent);

    }//end clickMobile Method

    public void clickMap(View view) {
        String lat = "13.776195";
        String lng = "100.510691";
        String label = "มหาวิทยาลัยสวนดุสิต";

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:" + lat + "," + lng + ",(" + label + ")");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("com.google.android.apps.maps");ใช้ในกรณี บังคับเปิด map ของ google (ใช้เทสใน genymotion ไม่ได้)
        startActivity(mapIntent);
    }
}//end Class
