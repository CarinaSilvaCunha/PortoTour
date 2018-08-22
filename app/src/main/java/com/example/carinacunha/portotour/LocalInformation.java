package com.example.carinacunha.portotour;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class LocalInformation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_information);

        // In order to open their respective view, we need to get the context of current object that was passed along in the intent
        // portoLocalName - portoLocalDescription - portoLocalURL
        // portoLocalEmail - portoLocalPhone - portoLocalAddress -  portoLocalPicture
        Bundle portoBundle = getIntent().getExtras();
        assert portoBundle != null;

        // Set the name as the screen title
        String currentPortoLocalName = portoBundle.getString(getString(R.string.local_intent_name));
        this.setTitle(currentPortoLocalName);

        // Set the Small Description, we don't need it for now, but it's taken cared of for the future
        String currentPortoLocalSmallDescription = portoBundle.getString(getString(R.string.local_intent_small_desc));

        // Set the full description
        String currentPortoLocalDescription = portoBundle.getString(getString(R.string.local_intent_full_desc));
        TextView currentPortoLocalDescriptionTextView = findViewById(R.id.local_information_description);
        currentPortoLocalDescriptionTextView.setText(currentPortoLocalDescription);

        // Set the URL
        final String currentPortoLocalURL = portoBundle.getString(getString(R.string.local_intent_url));
        ImageButton currentPortoLocalURLImageButton = findViewById(R.id.local_information_website);

        currentPortoLocalURLImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openWebsite = new Intent(Intent.ACTION_VIEW);
                openWebsite.setData(Uri.parse(currentPortoLocalURL));
                if (openWebsite.resolveActivity(getPackageManager()) != null) {
                    startActivity(openWebsite);
                }
            }
        });

        // Set the E-mail Button
        final String currentPortoLocalEmail = portoBundle.getString(getString(R.string.local_intent_email));
        ImageButton currentPortoLocalEmailImageButton = findViewById(R.id.local_information_email);
        currentPortoLocalEmailImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setData(Uri.parse("mailto:"));
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_EMAIL, currentPortoLocalEmail);
                email.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.local_intent_email));
                if (email.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(email, "Send E-mail"));
                }
            }
        });


        // When you click the telephone icon, it sends an intent to start a phone call
        // This intent is only accomplished if there's a permission inserted in the Manifest
        final int currentPortoLocalPhone = portoBundle.getInt(getString(R.string.local_intent_telephone));
        ImageButton currentPortoLocalPhoneImageButton = findViewById(R.id.local_information_telephone);

        currentPortoLocalPhoneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int telephoneCall = 1;
                String telephoneCallNumber = getString(R.string.local_intent_telephone) + currentPortoLocalPhone;

                Intent telephoneCallIntent = new Intent(Intent.ACTION_CALL);
                telephoneCallIntent.setData(Uri.parse(telephoneCallNumber));

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (ContextCompat.checkSelfPermission(LocalInformation.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(LocalInformation.this, new String[]{Manifest.permission.CALL_PHONE}, telephoneCall);
                    } else {
                        startActivity(telephoneCallIntent);
                    }
                }
            }
        });

        // Set the address
        String currentPortoLocalAddressString = portoBundle.getString(getString(R.string.local_intent_address));
        TextView currentPortoLocalAddress = findViewById(R.id.local_information_address);
        currentPortoLocalAddress.setText(currentPortoLocalAddressString);

        // Set the proper image
        int currentPortoLocalPicture = portoBundle.getInt(getString(R.string.local_intent_picture));
        ImageView currentPortoLocalPictureImageView = findViewById(R.id.local_information_picture);
        currentPortoLocalPictureImageView.setImageResource(currentPortoLocalPicture);
    }
}

