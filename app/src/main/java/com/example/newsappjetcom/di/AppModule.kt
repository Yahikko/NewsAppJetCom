package com.example.newsappjetcom.di

import android.app.Application
import com.example.newsappjetcom.data.manager.LocalUserManagerImpl
import com.example.newsappjetcom.domain.manager.LocalUserManager
import com.example.newsappjetcom.domain.usecases.AppEntryUseCases
import com.example.newsappjetcom.domain.usecases.ReadAppEntry
import com.example.newsappjetcom.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}