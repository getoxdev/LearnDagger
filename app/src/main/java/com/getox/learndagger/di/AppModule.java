package com.getox.learndagger.di;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.getox.learndagger.R;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
{
    @Provides
    static RequestOptions provideRequestOptions()
    {
        return RequestOptions.placeholderOf(R.drawable.ic_launcher_background)
                            .error(R.drawable.ic_launcher_background);
    }

    @Provides
    static RequestManager provideGlideInstance(Application application,RequestOptions requestOptions)
    {
        return Glide.with(application)
                    .setDefaultRequestOptions(requestOptions);
    }

    @Provides
    static Drawable provideAppDrawable(Application application)
    {
        return ContextCompat.getDrawable(application,R.drawable.icon_main);
    }
}
