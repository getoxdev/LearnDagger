package com.getox.learndagger.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.getox.learndagger.di.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel
{
    private static final String TAG = "AuthViewModel";
    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi)
    {
        this.authApi = authApi;
        Log.e(TAG,"Working");

        if(this.authApi != null)
            Log.e(TAG, "Api successful");
        else
            Log.e(TAG, "Api unsuccessful");

    }
}
