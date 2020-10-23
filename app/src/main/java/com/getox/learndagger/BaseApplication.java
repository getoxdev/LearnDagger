package com.getox.learndagger;

import com.getox.learndagger.di.DaggerAppComponent;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class BaseApplication extends DaggerApplication
{
    public BaseApplication() {
        super();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
