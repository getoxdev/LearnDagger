package com.getox.learndagger.di;

import android.app.Application;

import com.getox.learndagger.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component
        (
                modules =
                        {
                            AndroidInjectionModule.class,
                            ActivityBuilderModule.class,
                            AppModule.class
                        }
        )
public interface AppComponent extends AndroidInjector<BaseApplication>
{
    @Component.Builder
    interface Builder
    {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
