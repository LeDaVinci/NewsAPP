package com.sdmc.newsapp.adapter;

import java.util.List;

import com.sdmc.newsapp.domain.News;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter<News>{
	
	private int mResource;
	public NewsAdapter(Context context, int resource, List<News> objects) {
		super(context, resource, objects);
		mResource = resource;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder = null;
		if (convertView ==null) {
			viewHolder = new ViewHolder();
			convertView = LayoutInflater.from(parent.getContext()).inflate(mResource, null);
		}
		return super.getView(position, convertView, parent);
	}
	
	static class ViewHolder {
		TextView titleTxtVw;
		TextView contentTxtVw;
	}
}
