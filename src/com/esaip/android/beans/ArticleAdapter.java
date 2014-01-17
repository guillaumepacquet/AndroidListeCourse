package com.esaip.android.beans;

import java.util.List;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class ArticleAdapter extends ArrayAdapter<Article>{

	public ArticleAdapter(Context context, int resource, List<Article> objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
	}

	//@Override
	//public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub		
		/*if(convertView == null) {
			LayoutInflater inflater = (LayoutInflater)getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView=inflater.inflate(R.layout.activity_list_item, null);
		} */
		
	//}
}
