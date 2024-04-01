package com.example.android.hilt.di

import com.example.android.hilt.data.AppDatabase_Impl
import com.example.android.hilt.navigator.AppNavigator
import com.example.android.hilt.navigator.AppNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class NavigationModel {

    @Binds
    abstract fun bindingNavigator(impl: AppNavigatorImpl):AppNavigator

}