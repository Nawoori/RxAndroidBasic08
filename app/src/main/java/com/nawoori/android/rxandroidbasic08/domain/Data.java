package com.nawoori.android.rxandroidbasic08.domain;

/**
 * Created by User on 2017-07-20.
 */

public class Data
{
    private com.nawoori.android.rxandroidbasic08.domain.RealtimeWeatherStation RealtimeWeatherStation;

    public RealtimeWeatherStation getRealtimeWeatherStation ()
    {
        return RealtimeWeatherStation;
    }

    public void setRealtimeWeatherStation (RealtimeWeatherStation RealtimeWeatherStation)
    {
        this.RealtimeWeatherStation = RealtimeWeatherStation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RealtimeWeatherStation = "+RealtimeWeatherStation+"]";
    }
}
