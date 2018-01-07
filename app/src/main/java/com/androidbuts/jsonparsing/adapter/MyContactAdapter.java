package com.androidbuts.jsonparsing.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.androidbuts.jsonparsing.R;
import com.androidbuts.jsonparsing.model.Contact;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyContactAdapter extends ArrayAdapter<Contact> {

    List<Contact> contactList;
    Context context;
    private LayoutInflater mInflater;

    // Constructors
    public MyContactAdapter(Context context, List<Contact> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        contactList = objects;
    }

    @Override
    public Contact getItem(int position) {
        return contactList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.layout_row_view, parent, false);
            vh = ViewHolder.create((LinearLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Contact item = getItem(position);

        vh.textViewName.setText(item.getTimeBegin());
        vh.textViewEmail.setText(item.getTimeEnd());
        vh.textViewLink.setText(item.getFileLink());
        //Picasso.with(context).load(item.getProfilePic()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(vh.imageView);

        return vh.rootView;
    }

    private static class ViewHolder {
        public final LinearLayout rootView;
        //public final ImageView imageView;
        public final TextView textViewName;
        public final TextView textViewEmail;
        public final TextView textViewLink;

        //private ViewHolder(RelativeLayout rootView, ImageView imageView, TextView textViewName, TextView textViewEmail) {
        private ViewHolder(LinearLayout rootView, TextView textViewName, TextView textViewEmail, TextView textViewLink) {
            this.rootView = rootView;
            //this.imageView = imageView;
            this.textViewName = textViewName;
            this.textViewEmail = textViewEmail;
            this.textViewLink = textViewLink;
        }

        public static ViewHolder create(LinearLayout rootView) {
            //ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView);
            TextView textViewName = (TextView) rootView.findViewById(R.id.textViewName);
            TextView textViewEmail = (TextView) rootView.findViewById(R.id.textViewEmail);
            TextView textViewLink = (TextView) rootView.findViewById(R.id.textFileLink);
            //return new ViewHolder(rootView, imageView, textViewName, textViewEmail);
            return new ViewHolder(rootView, textViewName, textViewEmail, textViewLink);
        }
    }
}
