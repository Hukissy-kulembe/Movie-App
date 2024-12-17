package com.example.filme.di;

import android.content.Context;
import com.example.filme.domain.datasource.MovieLocalDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideLocalDataSourceFactory implements Factory<MovieLocalDataSource> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideLocalDataSourceFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MovieLocalDataSource get() {
    return provideLocalDataSource(contextProvider.get());
  }

  public static AppModule_ProvideLocalDataSourceFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideLocalDataSourceFactory(contextProvider);
  }

  public static MovieLocalDataSource provideLocalDataSource(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLocalDataSource(context));
  }
}
