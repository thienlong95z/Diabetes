package com.example.stormfury.diabetes.Profile;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.stormfury.diabetes.R;
import com.example.stormfury.diabetes.Utils.UniversalImageLoader;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by stormfury on 2/23/2018.
 */

public class EditProfileFragment extends android.support.v4.app.Fragment {
    private static final String TAG = "EditProfileFragment";
    private ImageView mProfilePhoto;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editprofile, container, false);
        mProfilePhoto = (ImageView) view.findViewById(R.id.profile_photo);
        initImageLoader();
        setProfileImage();

        //back arrow for navigating back to profile activity
        ImageView backArrow = (ImageView) view.findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating back to ProfileActivity");
                getActivity().finish();
            }
        });
        return view;
    }

    private void initImageLoader(){
        UniversalImageLoader universalImageLoader = new UniversalImageLoader(getActivity());
        ImageLoader.getInstance().init(universalImageLoader.getConfig());
    }
    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile image.");
        String imgURL = "cdn2.techadvisor.co.uk/cmsdata/features/3614881/Android_thumb800.jpg";
        UniversalImageLoader.setImage(imgURL, mProfilePhoto, null, "https://");
    }
}
