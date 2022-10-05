package com.example.contacts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.InputStream;
import java.util.ArrayList;

public class ContactsListAdapter extends ArrayAdapter<ContactsList> {

    private Context context;
    int mResource;
    public ContactsListAdapter(Context context, int mResource, ArrayList<ContactsList> list){
        super(context,mResource,list);
        this.context=context;
        this.mResource=mResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String imageLink = getItem(position).getImageLink();
        String name = getItem(position).getName();
        String country = getItem(position).getCountry();
        String mobile = getItem(position).getMobile();

        //creating object
        //ContactsList list = new ContactsList(imageLink, name, country, mobile);

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView imageURL = (ImageView) convertView.findViewById(R.id.imageView);
        TextView nameText = (TextView) convertView.findViewById(R.id.textViewName);
        TextView countryText = (TextView) convertView.findViewById(R.id.textViewCountry);
        TextView mobileText = (TextView) convertView.findViewById(R.id.textViewMobile);



        nameText.setText(name);
        countryText.setText(country);
        mobileText.setText(mobile);

        return convertView;
    }


}
