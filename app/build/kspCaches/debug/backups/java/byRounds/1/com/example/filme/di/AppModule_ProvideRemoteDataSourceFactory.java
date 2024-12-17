package com.example.filme.di;

import com.example.filme.data.remote.MovieApiService;
import com.example.filme.domain.datasource.MovieRemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
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
public final class AppModule_ProvideRemoteDataSourceFactory implements Factory<MovieRemoteDataSource> {
  private final Provider<MovieApiService> apiServiceProvider;

  public AppModule_ProvideRemoteDataSourceFactory(Provider<MovieApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public MovieRemoteDataSource get() {
    return provideRemoteDataSource(apiServiceProvider.get());
  }

  public static AppModule_ProvideRemoteDataSourceFactory create(
      Provider<MovieApiService> apiServiceProvider) {
    return new AppModule_ProvideRemoteDataSourceFactory(apiServiceProvider);
  }

  public static MovieRemoteDataSource provideRemoteDataSource(MovieApiService apiService) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRemoteDataSource(apiService));
  }
}
