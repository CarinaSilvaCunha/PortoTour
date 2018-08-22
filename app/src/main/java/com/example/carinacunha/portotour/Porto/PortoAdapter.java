package com.example.carinacunha.portotour.Porto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.carinacunha.portotour.LocalInformation;
import com.example.carinacunha.portotour.R;

import java.util.ArrayList;

public class PortoAdapter extends ArrayAdapter<Porto> {

    private Context context = getContext();

    // Inflate layout and details
    public PortoAdapter(Activity context, ArrayList<Porto> porto) {
        super(context, 0, porto);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View portoListView = convertView;
        if (portoListView == null) {
            portoListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.porto_list, parent, false);
        }

        // This is used to find the current selected object
        Porto currentLocal = getItem(position);


        // Associate the current select name with the layout text view of porto_list.xml
        TextView portoLocalName = portoListView.findViewById(R.id.portoLocalName);
        assert currentLocal != null;
        portoLocalName.setText(currentLocal.getPortoLocalName());

        // Associate the current select small description with the layout text view of porto_list.xml
        TextView portoSmallDescription = portoListView.findViewById(R.id.portoSmallDesc);
        portoSmallDescription.setText(currentLocal.getPortoLocalSmallDescription());

        // Associate the current image with the layout image view of porto_list.xml
        ImageView portoLocalPicture = portoListView.findViewById(R.id.porto_picture_list);
        portoLocalPicture.setImageResource(currentLocal.getPortoLocalPicture());

        // In order to open their respective view, we need to get the context of current object and pass it along to the intent
        // portoLocalName - portoLocalSmallDescription - portoLocalDescription - portoLocalURL
        // portoLocalEmail - portoLocalPhone - portoLocalAddress -  portoLocalPicture
        String currentPortoLocalName = currentLocal.getPortoLocalName();
        String currentPortoLocalSmallDescription = currentLocal.getPortoLocalSmallDescription();
        String currentPortoLocalDescription = currentLocal.getPortoLocalDescription();
        String currentPortoLocalURL = currentLocal.getPortoLocalURL();
        String currentPortoLocalEmail = currentLocal.getPortoLocalEmail();
        int currentPortoLocalPhone = currentLocal.getPortoLocalPhone();
        String currentPortoLocalAddress = currentLocal.getPortoLocalAddress();
        int currentPortoLocalPicture = currentLocal.getPortoLocalPicture();


        // Create an intent that will display the information once the user clicks it
        final Intent locationInformation = new Intent(context, LocalInformation.class);


        // This process sends the string information to the LocalInformation.java to extract the information from the intent
        locationInformation.putExtra(context.getString(R.string.local_intent_name), currentPortoLocalName);
        locationInformation.putExtra(context.getString(R.string.local_intent_small_desc), currentPortoLocalSmallDescription);
        locationInformation.putExtra(context.getString(R.string.local_intent_full_desc), currentPortoLocalDescription);
        locationInformation.putExtra(context.getString(R.string.local_intent_url), currentPortoLocalURL);
        locationInformation.putExtra(context.getString(R.string.local_intent_email), currentPortoLocalEmail);
        locationInformation.putExtra(context.getString(R.string.local_intent_telephone), currentPortoLocalPhone);
        locationInformation.putExtra(context.getString(R.string.local_intent_address), currentPortoLocalAddress);
        locationInformation.putExtra(context.getString(R.string.local_intent_picture), currentPortoLocalPicture);

        // Start the intent if the user taps
        portoListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(locationInformation);
            }
        });

        return portoListView;
    }
}
