package sbf.shafi.abdullahalshafi;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view) {
        Intent callintent = new Intent(Intent.ACTION_CALL);
        callintent.setData(Uri.parse("tel:" + "+8801799747472"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling

            return;
        }
        startActivity(callintent);
    }

    public void sms(View view) {
        Intent smsintent = new Intent(Intent.ACTION_SENDTO);
        smsintent.setData(Uri.parse("sms:" +"+8801799747472"));
        startActivity(smsintent);
    }

    public void mail(View view) {

    }

    public void web(View view) {

    }

    public void gmail(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri data = Uri.parse("mailto:"+"shafi.sbf@gmail.com");
        intent.setData(data);
        startActivity(intent);
    }

    public void outlook(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri data = Uri.parse("mailto:"+"abdullah_al.shafi@outlook.com");
        intent.setData(data);
        startActivity(intent);
    }

    public void linkedin(View view) {
        Uri uri = Uri.parse("https://www.linkedin.com/in/abdullah-al-shafi-085505148/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void facebook(View view) {
        Uri uri = Uri.parse("https://www.facebook.com/shafi.sbf"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void github(View view) {
        Uri uri = Uri.parse("https://github.com/abdullah-al-shafi"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
