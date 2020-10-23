package com.getox.learndagger.di;

import com.getox.learndagger.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule
{
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();
}
