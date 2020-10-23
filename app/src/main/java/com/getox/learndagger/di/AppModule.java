package com.getox.learndagger.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
{
    @Provides
    static String someString()
    {
        return "Test 123!";
    }

    @Provides
    static Boolean getApp(Application application)
    {
        return application==null;
    }

    @Provides
    static int someString2(String string)
    {
        if(string.equals("Test 123!"))
            return 1;
        else
            return 0;
    }
}
