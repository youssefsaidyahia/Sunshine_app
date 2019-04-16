package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by YOUSSEF on 18/07/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{
    private  String[] mWeatherData;
    public ForecastAdapter(){};
    public class  ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        TextView mWeatherTextView;
        public  ForecastAdapterViewHolder(View view) {
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }
    }
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context =parent.getContext();
        int L =R.layout.forecast_list_item;
        LayoutInflater inflater =LayoutInflater.from(context);
        boolean x=false;
        View view=inflater.inflate(L,parent,x);
        ForecastAdapterViewHolder v=new ForecastAdapterViewHolder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position){
        String w=mWeatherData[position];
        holder.mWeatherTextView.setText(w);
    }

    @Override
    public int getItemCount() {
        if (null == mWeatherData) {
            return 0;
        } else {
            return mWeatherData.length;
        }
    }
    public void setWeatherData(String[] m){
        mWeatherData=m;
        notifyDataSetChanged();
    }
}
