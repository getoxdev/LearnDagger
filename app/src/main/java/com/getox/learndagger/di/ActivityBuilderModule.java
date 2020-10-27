package com.getox.learndagger.di;

import com.getox.learndagger.di.auth.AuthViewModelModule;
import com.getox.learndagger.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule
{
    @ContributesAndroidInjector(
            modules = {
                    AuthViewModelModule.class
            }
    )
    abstract AuthActivity contributeAuthActivity();
}
