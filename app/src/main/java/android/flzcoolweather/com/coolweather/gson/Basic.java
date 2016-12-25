package android.flzcoolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 龙哲 on 2016-12-25.
 */

public class Basic {

    @SerializedName("city")
    public  String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
