package com.example.johnfash.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter{
    Context mContext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;

    public ListAdapter(Context mContext, List<Model> modelList) {
        this.mContext = mContext;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }

    public class ViewHolder{
        TextView mPlaceNameTv,mPlaceLocationTv,mPlaceGeoTv;
        ImageView mPlaceImageIv;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.row,null);
            holder.mPlaceNameTv = convertView.findViewById(R.id.mainName);
            holder.mPlaceLocationTv = convertView.findViewById(R.id.mainLocation);
            holder.mPlaceImageIv = convertView.findViewById(R.id.placeImage);
            holder.mPlaceGeoTv = convertView.findViewById(R.id.mainGeo);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.mPlaceNameTv.setText(modelList.get(position).getPlaceName());
        holder.mPlaceLocationTv.setText(modelList.get(position).getLocation());
        holder.mPlaceGeoTv.setText(modelList.get(position).getLocation());
        holder.mPlaceImageIv.setImageResource(modelList.get(position).getPlaceImage());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loc = modelList.get(position).getPlaceGeo().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(loc));
                mContext.startActivity(intent);
            }
        });
        return convertView;
    }
}
