package android.flzcoolweather.com.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.flzcoolweather.com.coolweather.gson.Weather;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prfs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prfs.getString("weather",null) != null){
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
