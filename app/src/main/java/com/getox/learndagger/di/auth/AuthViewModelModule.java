package com.getox.learndagger.di.auth;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.getox.learndagger.di.ViewModelKey;
import com.getox.learndagger.ui.auth.AuthViewModel;
import com.getox.learndagger.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule
{
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel authViewModel);

}
