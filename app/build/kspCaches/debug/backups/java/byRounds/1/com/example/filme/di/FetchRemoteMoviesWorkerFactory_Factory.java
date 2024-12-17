package com.example.filme.di;

import com.example.filme.domain.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class FetchRemoteMoviesWorkerFactory_Factory implements Factory<FetchRemoteMoviesWorkerFactory> {
  private final Provider<MovieRepository> movieRepositoryProvider;

  public FetchRemoteMoviesWorkerFactory_Factory(Provider<MovieRepository> movieRepositoryProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public FetchRemoteMoviesWorkerFactory get() {
    return newInstance(movieRepositoryProvider.get());
  }

  public static FetchRemoteMoviesWorkerFactory_Factory create(
      Provider<MovieRepository> movieRepositoryProvider) {
    return new FetchRemoteMoviesWorkerFactory_Factory(movieRepositoryProvider);
  }

  public static FetchRemoteMoviesWorkerFactory newInstance(MovieRepository movieRepository) {
    return new FetchRemoteMoviesWorkerFactory(movieRepository);
  }
}
